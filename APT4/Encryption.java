package APT4;

import java.util.HashMap;
import java.util.HashSet;

public class Encryption {
	
	public String encrypt(String message) {
		HashMap<Character, Character> dict = new HashMap<Character, Character>();
		
		String res = "";
		char current = 'a';
				
		for(char c : message.toCharArray()) {
			if(!dict.containsKey(c)) {
				dict.put(c, current);
				current++;
			}
			res += dict.get(c);
		}
		
		return res;
	}
	
	public String encrypt2(String message){
        HashSet<String> letter = new HashSet<String>();
        char c = 'a' - 1;
        String ans = "";
        char[] boof = new char[message.length()];
        for(int i = 0; i < message.length(); i++) {
            if(letter.add(message.substring(i, i+1))) {
                c++;
                ans += Character.toString(c);
                
                boof[i] = c;
            }
            else {
                for(int j = 0; j < message.length(); j ++) {
                    if(i != j && message.substring(i, i+1).equals(message.substring(j, j+1))) {
                        ans += Character.toString(boof[j]);
                    }
                }
            }
        }

        return ans;
    }

	public static void main(String[] args) {
		String message = "encryption";
		
		Encryption e = new Encryption();
		
		String me = e.encrypt(message);
		String tim = e.encrypt2(message);
		
		System.out.printf("ME: %s\nTIM: %s\nEqual: %b", me, tim, me.equals(tim));
	}

}
