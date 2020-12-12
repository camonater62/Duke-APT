package APT7;

public class SortedListRemoval {
	
	public ListNode uniqify(ListNode list) {		
		ListNode start = list;
		
		while(list != null && list.next != null) {
			if(list.next.info == list.info) {
				list.next = list.next.next;
			} else {
				list = list.next;
			}
		}
		
		return start;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1,1,1,2,2,3,3,3,3,9,9,9,9);
		
		System.out.println(new SortedListRemoval().uniqify(list));
	}

}
