package APT6;

public class ListSum {
	
	public int sum(ListNode list, int thresh) {
		int res = 0;
		while(list != null) {
			if(list.info > thresh) {
				res += list.info;
			}
			list = list.next;
		}
		return res;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1,2,3,4,5,6,7,8,9,10);
		int thresh = -22;
		
		System.out.println(new ListSum().sum(list, thresh));
	}

}
