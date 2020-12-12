package APT8;

import java.util.*;

public class MedalTable {

	public String[] generate(String[] results) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : results) {
			String[] countries = s.split(" ");
			for(int i = 0; i < 3; i++) {
				int val = map.getOrDefault(countries[i], 0);
				val += Math.pow(100, 2 - i);
				map.put(countries[i], val);
			}
		}
		
		String[] list = map.keySet().toArray(String[]::new);
		Arrays.sort(list, Comparator.comparing(map::get).reversed().thenComparing(String::valueOf));
		
		for(int i = 0; i < list.length; i++) {			
			int val = map.get(list[i]);			
			int b = val % 100; val /= 100;
			int s = val % 100; val /= 100;
			int g = val % 100;
			
			list[i] += String.format(" %d %d %d", g, s, b);
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		String[] results = {"ITA JPN AUS", "KOR TPE UKR", "KOR KOR GBR", "KOR CHN TPE"};
		
		System.out.println(Arrays.toString(new MedalTable().generate(results)));
	}

}
