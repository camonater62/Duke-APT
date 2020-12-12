package APT8;

import java.util.*;

public class LengthSort {
	
	public String[] rearrange(String[] values) {
		Arrays.sort(values, new Comparator<String>() {
			public int compare(String a, String b) {
				int diff = a.length() - b.length();
				return diff == 0 ? a.compareTo(b) : diff;
			}			
		});
		//Arrays.sort(values, Comparator.comparing(String::length).thenComparing(String::valueOf));
		return values;
	}

	public static void main(String[] args) {
		String[] values = { "cat", "bat", "flavor", "yellow", "easy", "code" };
		
		System.out.println(Arrays.toString(new LengthSort().rearrange(values)));
	}

}
