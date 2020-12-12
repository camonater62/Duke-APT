package APT1;

public class Gravity {
	
	public double falling(double time, double velo) {
		return velo*time + 0.5*9.8*time*time;
	}

	public static void main(String[] args) {
		double time = 86400;
		double velo = 0;
		
		System.out.println(new Gravity().falling(time, velo));
	}

}
