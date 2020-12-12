package APT6;

public class ListsEqual {
	
	public int equal(ListNode a1, ListNode a2) {
		while(a1 != null && a2 != null) {
			if(a1.info != a2.info)
				return 0;
			a1 = a1.next;
			a2 = a2.next;
		}
		
		if(a1 != a2)
			return 0;
		
		return 1;
	}

	public static void main(String[] args) {
		ListNode a1 = new ListNode(6,5,3,8);
		ListNode a2 = new ListNode(6,5,3,8,9);
		
		System.out.println(new ListsEqual().equal(a1, a2));
	}

}
