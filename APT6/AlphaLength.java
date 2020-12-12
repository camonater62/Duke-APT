package APT6;

import java.util.*;

public class AlphaLength {
	
	public ListNode create(String[] words) {
		Arrays.sort(words);
		
		ListNode root = new ListNode(words[0].length());
		ListNode pointer = root;
		
		for(int i = 1; i < words.length; i++) {
			if(!words[i].equals(words[i - 1])) {
				pointer.next = new ListNode(words[i].length());
				pointer = pointer.next;
			}			
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		String[] words = { "zero", "nothing", "infinity", "zero", "zero", "zero", "all" };
		
		System.out.println(new AlphaLength().create(words));
	}
	
}