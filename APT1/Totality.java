package APT1;

public class Totality {
	
	public int sum(int[] a, String stype) {		
		int i = stype.equals("odd") ? 1 : 0;
		int inc = stype.equals("all") ? 1 : 2;
		
		int total = 0;
		
		for(; i < a.length; i += inc) {
			total += a[i];
		}
		
		return total;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		String stype = "even";
		
		System.out.println(new Totality().sum(a, stype));
	}

}
