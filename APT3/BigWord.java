package APT3;

import java.util.HashMap;

public class BigWord {
	
	public String most(String[] sentences) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : sentences) {		
			String[] words = s.split(" ");
			
			for(int i = 0; i < words.length; i++) {
				String w = words[i].toLowerCase();
				map.putIfAbsent(w, 0);
				map.put(w, map.get(w) + 1);
			}
		}
		
		int largest = 0;
		String res = "";
		for(String s : map.keySet()) {
			if(map.get(s) > largest) {
				largest = map.get(s);
				res = s;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		String[] sentences = { "This is the way", "This is the way", "this is this" };
		
		System.out.println(new BigWord().most(sentences));
	}

}
