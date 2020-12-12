package APT4;

import java.util.Arrays;

public class SoccerLeagues {
	
	public int[] points(String[] matches) {
		int[] score = new int[matches.length];
		
		for(int i = 0; i < matches.length; i++) {
			for(int j = 0; j < matches.length; j++) {
				switch(matches[i].charAt(j)) {
				case 'W':
					score[i] += 3;
					break;
				case 'L':
					score[j] += 3;
					break;
				case 'D':
					score[i]++;
					score[j]++;
					break;
				}
			}
		}		
		
		return score;
	}

	public static void main(String[] args) {
		String[] matches = {"-LWWLWDLDWWWWWWDDWDW",
				 "D-WWLDDWDWDLWDDWLWDD",
				 "LL-DLDWDLDLDWWWLWDDW",
				 "LDD-LLLDLWLWWWWDWDWL",
				 "LWWW-DWDLWDWDWWWDWDW",
				 "DLLWD-WWLLDDDLWWDWWW",
				 "WWLWDL-LLDWWWWWDWWLW",
				 "LLLLLDW-LDLWDDLLLDWL",
				 "DWWWWDDD-DWWWWDWWWDW",
				 "WWWWLLLWL-LWWWWWLWWW",
				 "DWWWWWWWLW-WDWWWWWWW",
				 "DDDLLLDWWWL-DDWDWLDD",
				 "LWLWLDLLLDLW-DDDWWDD",
				 "LLWWLWDDLWLWL-WWWDLL",
				 "WWWWLLDDDWLWDD-WWWLW",
				 "DLDLLLWWLLLWWLW-DWLL",
				 "DLWWWLDLWWDWWDWL-WWD",
				 "LLDDLLWLLWLWLDLWW-WW",
				 "LLWLLLWWLWLWWDWWLD-W",
				 "LLWDLWDWDWLLWWDDWWL-"};
		
		System.out.println(Arrays.toString(new SoccerLeagues().points(matches)));
	}

}
