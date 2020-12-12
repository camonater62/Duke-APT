package APT9;

public class TreeCount {
	
	public int count(TreeNode tree) {
		if(tree == null) return 0;
		if(tree.left == tree.right) return 1;
		return count(tree.left) + count(tree.right) + 1;
	}

	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		TreeNode tree = new TreeNode(new int[]{8, 4, x, 6, x, x, 12, 10, x, x, 15, x, x});
		if(tree.info == Integer.MIN_VALUE) tree = null;
		
		System.out.println(new TreeCount().count(tree));
	}

}
