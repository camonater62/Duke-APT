package APT8;

import java.util.*;

public class SyllableSorting {
	
	private boolean isVowel(char c) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for(int i = 0; i < vowels.length; i++)
			if(c == vowels[i]) return true;
		return false;
	}
	
	private String[] getSyllables(String word) {
		ArrayList<String> syllables = new ArrayList<String>();
		for(int x = 1; x < word.length(); x++) {				
			if(!isVowel(word.charAt(x)) && isVowel(word.charAt(x - 1))) {
				String syllable = word.substring(0, x);
				word = word.substring(x);
				x -= syllable.length();
				syllables.add(syllable);
			}
		}
		syllables.add(word);
		
		return syllables.toArray(String[]::new);
	}
	
	public String[] sortWords(String[] words) {		
		HashMap<String, String[]> map = new HashMap<>();
		
		for(int i = 0; i < words.length; i++) {		
			String[] syllables = getSyllables(words[i]);
			Arrays.sort(syllables);
			map.put(words[i], syllables);			
		}
		
		String[] sorted = map.keySet().toArray(String[]::new);
		Arrays.sort(sorted, new Comparator<String>() {
			public int compare(String a, String b) {
				int diff = Arrays.compare(map.get(a), map.get(b));
				if(diff == 0) diff = Arrays.compare(getSyllables(a), getSyllables(b));
						
				return diff;
			}
		});		
		
		return sorted;
	}

	public static void main(String[] args) {
		String[] words = {"baaba", "babaada"};
		
		System.out.println(Arrays.toString(new SyllableSorting().sortWords(words)));
	}

}
