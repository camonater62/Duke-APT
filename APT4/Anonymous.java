package APT4;

import java.util.ArrayList;

public class Anonymous {
	
	public int howMany(String[] headlines, String[] messages) {
		int count = 0;
		
		for(int i = 0; i < messages.length; i++) {
			ArrayList<Character> chars = new ArrayList<Character>();
			
			for(int j = 0; j < headlines.length; j++) {
				for(char c : headlines[j].toLowerCase().toCharArray()) {
					chars.add(c);
				}
			}
			
			boolean valid = true;
			for(char c : messages[i].toLowerCase().toCharArray()) {
				if(chars.contains(c)) {
					chars.remove(chars.indexOf(c));
				} else if(c != ' '){
					valid = false;
				}
			}
			
			if(valid)
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String[] headlines = {
				"abcdef","abcdef"
		};
		
		String[] messages = {
				"AaBbCc","aabbbcc","   ","FADE"
		};
		
		System.out.println(new Anonymous().howMany(headlines, messages));
	}

}
