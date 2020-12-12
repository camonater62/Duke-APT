package APT9;

public class LevelCount {
	
	public int count(TreeNode t, int level) {
		if(t == null) return 0;
		if(level == 0) return 1;
		
		return count(t.left, level - 1) + count(t.right, level - 1);
	}

	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		TreeNode t = TreeNode.make(new int[]{1, 2, 3, 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x, 
	              4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x, 
	              3, 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x, 
	                 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x, 
	           2, 3, 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x, 
	                 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x, 
	              3, 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x, 
	                 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x});
		
		int level = 5;
		
		System.out.println(new LevelCount().count(t, level));
	}

}
