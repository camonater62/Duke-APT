package APT8;

import java.util.*;

public class TournamentRanker {
	
	private int indexOf(String[] arr, String key) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i].equals(key)) return i;
		return -1;
	}
	
	public String[] rankTeams(String[] names, String[] lostTo) {
		HashMap<String, Integer> record = new HashMap<String, Integer>();
		for(int i = 0; i < names.length; i++) {
			String other = lostTo[i];
			if(other.equals("")) other = names[i];
			int val = record.getOrDefault(other, 0) + 1;
			record.put(other, val);
		}
		
		String[] sorted = Arrays.copyOf(names, names.length);		
		Arrays.sort(sorted, new Comparator<String>() {
			public int compare(String a, String b) {
				int diff = record.getOrDefault(b, 0) - record.getOrDefault(a, 0);				
				if(diff == 0) // Equal so who lost to the better team?
					diff = compare(lostTo[indexOf(names, a)], lostTo[indexOf(names, b)]);
				return diff;
			}			
		});
		
		return sorted;
	}

	public static void main(String[] args) {
		String[] names = {"DUKE", "SETON HALL", "ILLINOIS", "CINCINNATI", "NORTH CAROLINA", "TEXAS", "XAVIER", "MISSISSIPPI STATE"};
		String[] lostTo = {"", "DUKE", "DUKE", "ILLINOIS", "TEXAS", "XAVIER", "DUKE", "XAVIER"};
		
		System.out.println(Arrays.toString(new TournamentRanker().rankTeams(names, lostTo)));
	}

}
