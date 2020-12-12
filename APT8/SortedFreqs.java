package APT8;

import java.util.*;

public class SortedFreqs {
	
	public int[] freqs(String[] data) {
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		
		for(String s : data) {
			int val = tree.getOrDefault(s, 0) + 1;
			tree.put(s, val);
		}
		
		int[] arr = new int[tree.size()];
		
		int i = 0;
		for(String s : tree.keySet()) {
			arr[i++] = tree.get(s);
		}
		
		return arr;
	}

	public static void main(String[] args) {
		String[] data = {"apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"};
		
		System.out.println(Arrays.toString(new SortedFreqs().freqs(data)));
	}

}
