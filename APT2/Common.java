package APT2;

public class Common {
	
	public int count(String a, String b) {
		int res = 0;
		
		for(int i = 0; i < a.length(); i++) {			
			for(int j = 0; j < b.length(); j++) {
				if(a.charAt(i) == b.charAt(j)) {
					res++;
					
					char c = a.charAt(i);
					
					a = a.replaceFirst(c + "", "");
					b = b.replaceFirst(c + "", "");
										
					i--;
					break;
				}
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		String a = "horse";
		String b = "seems";
		
		System.out.println(new Common().count(a, b));
	}
}
