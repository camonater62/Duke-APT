package APT3;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCuts {
	
	public String[] filter(String[] list, int minLength) {
		ArrayList<String> good = new ArrayList<String>();
		
		for(int i = 0; i < list.length; i++) {
			boolean repeat = false;
			for(int j = 0; !repeat && j < i; j++) {
				if(list[i].equals(list[j]))
					repeat = true;
			}
			if(!repeat && list[i].length() >= minLength)
				good.add(list[i]);
		}
		
		String[] res = new String[good.size()];
		for(int i = 0; i < good.size(); i++)
			res[i] = good.get(i);
			
		return res;
	}

	public static void main(String[] args) {
		String[] list = { "boisterous" };
		int minLength = 10;
		
		System.out.println(Arrays.toString(new StringCuts().filter(list, minLength)));
	}

}
