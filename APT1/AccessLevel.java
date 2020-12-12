package APT1;

public class AccessLevel {
	
	public String canAccess(int[] rights, int minPermission) {
		String res = "";
		
		for(int i = 0; i < rights.length; i++) {
			res += (rights[i] < minPermission) ? "D" : "A";
		}
		
		return res;
	}

	public static void main(String[] args) {
		int[] rights = { 34, 78, 9, 52, 11, 1 };
		int minPermission = 49;
		
		System.out.println(new AccessLevel().canAccess(rights, minPermission));
	}

}
