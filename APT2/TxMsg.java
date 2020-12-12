package APT2;

public class TxMsg {

	private boolean isVowel(char c) {
		final char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for(int i = 0; i < vowels.length; i++) {
			if(c == vowels[i])
				return true;
		}
		return false;
	}

	public String getMessage(String original) {
		String[] split = original.split(" ");
		String res = "";

		for(String s : split) {
			int numCon = 0;
			String current = "";
			
			for(int i = 0; i < s.length(); i++) {
				if(!isVowel(s.charAt(i))) {
					numCon++;
					if(i == 0 || isVowel(s.charAt(i - 1))) {
						current += s.charAt(i);
					}
				}					
			}
			
			if(numCon == 0) {
				current = s;
			}
			res += current + " ";
		}

		return res.trim();
	}

	public static void main(String[] args) {
		String original = "back to the ussr";

		System.out.println(new TxMsg().getMessage(original));
	}

}
