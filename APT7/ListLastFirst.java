package APT7;

public class ListLastFirst {
	
	public ListNode move(ListNode list) {	
		if(list == null || list.next == null) 
			return list;
		
		ListNode first = list;
		
		while(list.next != null && list.next.next != null) {
			list = list.next;
		}
		
		ListNode fin = list.next;
		fin.next = first;
		
		list.next = null;
		
		return fin;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1,1,1,1);
		
		System.out.println(new ListLastFirst().move(list));
	}

}
