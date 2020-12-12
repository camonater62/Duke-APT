package APT4;

public class IsomorphicWords {
	
	private boolean canMap(String a, String b) {
		for(int i = 0; i < a.length(); i++) {
			int aCount = 0, bCount = 0;
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(i) == a.charAt(j)) {
					aCount++;
				}
				if(b.charAt(i) == b.charAt(j)) {
					bCount++;
				}
			}
			if(aCount != bCount) 
				return false;

			a = a.substring(1);
			b = b.substring(1);
		}
		
		return true;
	}
	
	public int countPairs(String[] words) {
		int count = 0;
		
		for(int i = 0; i < words.length - 1; i++) {
			for(int j = i + 1; j < words.length; j++) {
				if(canMap(words[i], words[j]))
					count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		String[] words = {"cacccdaabc", "cdcccaddbc", "dcdddbccad", "bdbbbaddcb",
				  "bdbcadbbdc", "abaadcbbda", "babcdabbac", "cacdbaccad",
				  "dcddabccad", "cacccbaadb", "bbcdcbcbdd", "bcbadcbbca"};
		
		System.out.println(new IsomorphicWords().countPairs(words));
	}

}
