package APT8;

import java.util.*;

public class SortByFreqs {
	
	public String[] sort(String[] data) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : data) {
			int val = map.getOrDefault(s, 0) + 1;
			map.put(s, val);
		}
		
		String[] list = map.keySet().toArray(new String[map.size()]);
		Arrays.sort(list, new Comparator<String>() {
			public int compare(String a, String b) {
				int diff = map.get(b) - map.get(a);
				return diff == 0 ? a.compareTo(b) : diff;
			}
		});
		
		return list;
	}

	public static void main(String[] args) {
		String[] data = {"apple", "pear", "cherry", "apple", "pear", "apple", "banana"};
		
		System.out.println(Arrays.toString(new SortByFreqs().sort(data)));
	}

}
