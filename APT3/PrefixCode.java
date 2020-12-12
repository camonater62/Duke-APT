package APT3;

public class PrefixCode {
	
	public String isOne(String[] words) {
		for(int i = 0; i < words.length; i++) {
			for(int j = 0; j < words.length; j++) {
				if(j != i && words[j].startsWith(words[i])) {
					return "No, " + i;
				}
			}
		}
		return "Yes";
	}

	public static void main(String[] args) {
		String[] words = { "10001", "011", "100", "001", "10" };
		
		System.out.println(new PrefixCode().isOne(words));
	}

}
