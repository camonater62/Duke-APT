package APT3;

public class TrueSpace {
	
	public long calculateSpace(int[] sizes, int clusterSize) {
		long clusters = 0;
		
		for(int i = 0; i < sizes.length; i++) {
			while(sizes[i] > 0) {
				sizes[i] -= clusterSize;
				clusters++;
			}
		}
		
		return clusters * clusterSize;
	}

	public static void main(String[] args) {
		int[] sizes = { 16,32,128,128,0 };
		int clusterSize = 32768;
		
		System.out.println(new TrueSpace().calculateSpace(sizes, clusterSize));
	}

}
