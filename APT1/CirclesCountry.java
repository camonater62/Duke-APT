package APT1;

public class CirclesCountry {
	
	public int LeastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {		
		int borderCount = 0;		
		
		for(int i = 0; i < x.length; i++) {			
			if(Math.sqrt(Math.pow(x1 - x[i], 2) + Math.pow(y1 - y[i], 2)) < r[i] 
			!= Math.sqrt(Math.pow(x2 - x[i], 2) + Math.pow(y2 - y[i], 2)) < r[i]) {
				borderCount++;
			}
		}		
		
		return borderCount;
	}

	public static void main(String[] args) {
		int[] x = { -3,  2,  2,  0, -4, 12, 12, 12 };
		int[] y = { -1,  2,  3,  1,  5,  1,  1,  1 };
		int[] r = {  1,  3,  1,  7,  1,  1,  2,  3 };
		
		int x1 = 2;
		int y1 = 3;
		int x2 = 13;
		int y2 = 2;
		
		System.out.println(new CirclesCountry().LeastBorders(x, y, r, x1, y1, x2, y2));
	}
	
}
