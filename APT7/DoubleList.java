package APT7;

public class DoubleList {
	
	public ListNode bigify(ListNode list) {
		ListNode start = list;
		
		while(list != null) {
			list.next = new ListNode(list.info, list.next);
			list = list.next.next;
		}
		
		return start;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1,2,3,4,5);
		
		System.out.println(new DoubleList().bigify(list));
	}

}
