package APT9;

public class PathSum {
	
	public int hasPath(int target, TreeNode tree) {
		if(target == tree.info 
		&& tree.left == null && tree.right == null) return 1;
		
		int left = (tree.left == null) ? 0 
				   : hasPath(target - tree.info, tree.left);
		int right = (tree.right == null) ? 0 
				    : hasPath(target - tree.info, tree.right);
		return left | right;
	}

	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		TreeNode tree = TreeNode.make(new int[] {5, 4, 11, 7, x, x, 2, x, x, x, 8, 13, x, x, 4, x, 1, x, x});
		
		int target = 18;
		
		System.out.println(new PathSum().hasPath(target, tree));
	}

}
