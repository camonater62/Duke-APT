package APT4;

import java.util.ArrayList;
import java.util.Arrays;

public class MemberCheck {
	
	public String[] whosDishonest(String[] club1,
								  String[] club2,
								  String[] club3) {
		ArrayList<String> people = new ArrayList<String>();
		
		for(String[] s : new String[][]{ club1, club2, club3 }) { 
			// Check duplicate
			
			for(int i = 0; i < s.length; i++) {
				boolean repeat = false;
				for(int j = 0; !repeat && j < i; j++) {
					if(s[i].equals(s[j])) {
						repeat = true;
					}
					
				}
				if(!repeat) {
					people.add(s[i]);
				}
			}
				
		}
		
		ArrayList<String> liars = new ArrayList<String>();
		
		for(int i = people.size() - 1; i > 0; i--) {
			boolean repeat = false;
			for(int j = i - 1; !repeat && j >= 0; j--) {				
				if(people.get(i).equals(people.get(j)) && !liars.contains(people.get(i))) {
					repeat = true;
					liars.add(people.get(i));
				}
			}
		}
		
		String[] res = new String[liars.size()];
		
		for(int i = 0; i < liars.size(); i++) {
			res[i] = liars.get(i);
		}
		
		Arrays.sort(res);
		
		return res;
	}
	
	public static void main(String[] args) {
		String[] club1 = {"AHHOZY","AHHAPLL","ASNV"};
		String[] club2 = {"AHDLTOE","AHUKPJ","AHDENCTPP","AHDENCJ","AHDLNZC","AHDLTOGG","AHHAPMBG",
				"ALE","AHBHA","AHUKP","AHDQMILLP","AHDENEDY","AHDENEE","AHHOHVCX","AHISK",
				"AHW","AQDB","AHUP","AQDBNPU","AGWZUV","AHHOSUW","AHXS","AHDENCP","AHDQM",
				"AHDLTURV","AHBHVV","AHDQMILL","AHDQMD","AHH","AHDLTU","AHISFNO","AHURF",
				"AH","AHHAPNQ","AQPL","AHDXL","AHDLTUGX","AHDLT","AHUKRC","AHDLTUGX",
				"AQDTXYX","AGWZS"};
		String[] club3 = {"AHHAPMFF","AHURA","AHHOZ","AHISKH","AHUPR","AHHAPM","AHUKRHIN","AHHAP",
				"AHDLTMO","AHDLTUJ","AHDQY","AHUK","AHDENEDY","AHWK","AHHOZGJJ","AHXS",
				"AHDLTUREL","AHHOZQNL","AHHOSUWOS"};
		
		System.out.println(Arrays.toString(new MemberCheck().whosDishonest(club1, club2, club3)));
	}

}
