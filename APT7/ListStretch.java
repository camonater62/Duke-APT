package APT7;

public class ListStretch {
	
	public ListNode stretch(ListNode list, int amount) {		
		ListNode start = list;
		
		while(list != null) {
			ListNode next = list.next;
			for(int j = 1; j < amount; j++) {
				list.next = new ListNode(list.info);
				list = list.next;
			}
			list.next = next;
			list = list.next;
		}
		
		return start;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(5, 6, 8, 9);
		int amount = 4;
		
		System.out.println(new ListStretch().stretch(list, amount));
	}

}
