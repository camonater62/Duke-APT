package APT3;

import java.util.Arrays;

public class CounterAttack {
	
	public int[] analyze(String str, String[] words) {
		String[] split = str.split(" ");
		int[] res = new int[words.length];
		
		for(int i = 0; i < words.length; i++) {
			int count = 0;
			for(int j = 0; j < split.length; j++) {
				if(words[i].equals(split[j]))
					count++;
			}
			res[i] = count;
		}
		
		return res;
	}

	public static void main(String[] args) {
		String str = "one two one two one two vorpal blade";
		String[] words = { "snicker", "one", "blade", "runner" };
		
		System.out.println(Arrays.toString(new CounterAttack().analyze(str, words)));
	}

}
