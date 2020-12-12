package APT6;

public class ListCount {
	
	public int count(ListNode list) {
		int res = 0;
		while(list != null) {
			res++;
			list = list.next;
		}
		return res;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(5, 6, 8, 9);
		
		System.out.println(new ListCount().count(list));
	}

}
