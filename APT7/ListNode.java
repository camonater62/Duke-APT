package APT7;

public class ListNode {
	int info;
	ListNode next;
	ListNode(int x) {
		info = x;
	}
	ListNode(int x, ListNode node) {
		info = x;
		next = node;
	}
	
	// Helpers
	ListNode(int ... vals) {
		ListNode pointer = this;
		for(int i = 0; i < vals.length - 1; i++) {
			pointer.info = vals[i];
			pointer.next = new ListNode(vals[i + 1]);
			pointer = pointer.next;
		}
	}
	
	public String toString() {
		String res = "[ ";
		ListNode pointer = this;
		while(pointer != null) {
			res += pointer.info + " ";
			pointer = pointer.next;
		}
		return res + "]";
	}
}
