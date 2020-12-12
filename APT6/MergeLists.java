package APT6;

public class MergeLists {
	
	public ListNode weave(ListNode a, ListNode b) {
		if(a == null || b == null) return null;
		return new ListNode(a.info, new ListNode(b.info, weave(a.next, b.next)));
	}
	
	public ListNode weave2(ListNode a, ListNode b) {
		if(a == null || b == null) return null;
		b.next = weave2(a.next, b.next);
		a.next = b;
		return a;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(4,2,1);
		ListNode b = new ListNode(10,20,30);
		
		System.out.println(new MergeLists().weave2(a, b));
	}

}
