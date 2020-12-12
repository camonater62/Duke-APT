package APT7;

public class RemoveMin {
	
	public ListNode remove(ListNode list) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		
		ListNode start = list;
		
		for(int i = 0; list != null; i++) {
			if(list.info < min) {
				min = list.info;
				index = i;
			}
			list = list.next;
		}
		
		if(index == 0)
			start = start.next;
		
		list = start;
		for(int i = 0; list != null; i++) {
			if(i == index - 1) {
				list.next = list.next.next;
			}
			list = list.next;
		}		
		
		return start;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(5,4,3,2,1);
		
		System.out.println(new RemoveMin().remove(list));
	}

}
