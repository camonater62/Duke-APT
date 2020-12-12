package APT1;

public class Starter {
	
	public int begins(String[] words, String first) {
		int count = 0;
		
		for(int i = 0; i < words.length; i++) {
			boolean repeat = false;
			for(int j = 0; !repeat && j < i; j++) {
				repeat = words[i].equals(words[j]);
			}
			if(!repeat && words[i].startsWith(first)) count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		String[] words = {"zebras", "zebra", "aardvarks", "yak", "yaks", "zebras", "elephants",
		         		  "zebras", "zebra", "aardvarks", "yak", "yaks", "zebras", "elephants"};
		String first = "z";
		
		System.out.println(new Starter().begins(words, first));
	}

}
