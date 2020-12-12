package APT2;

import java.util.ArrayList;

public class DNAMaxNucleotide {
	
	public String max(String[] strands, String nuc) {
		ArrayList<String> most = new ArrayList<String>();
		
		int maxCount = 0;
		
		for(int i = 0; i < strands.length; i++) {
			int count = 0;
			
			for(char c : strands[i].toCharArray()) {
				if(c == nuc.charAt(0)) {
					count++;
				}
			}
			
			if(count > maxCount) {
				maxCount = count;
				most.clear();
			}
			if(count == maxCount) {
				most.add(strands[i]);
			}
		}
		
		int maxLength = 0;
		int longestIndex = 0;
		
		for(int i = 0; i < most.size(); i++) {
			if(most.get(i).length() > maxLength) {
				maxLength = most.get(i).length();
				longestIndex = i;
			}
		}
		
		if(maxCount == 0) {
			return "";
		} else {
			return most.get(longestIndex);
		}
		
	}

	public static void main(String[] args) {
		String[] strands = {"g", "gg", "ggg", "gggg"};
		String nuc = "c";
		
		System.out.println(new DNAMaxNucleotide().max(strands, nuc));
	}

}
