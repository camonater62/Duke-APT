package APT9;

import java.util.Arrays;

public class TreeNode {
	int info;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x) {
		info = x;
	}
	
	TreeNode(int x, TreeNode lNode, TreeNode rNode) {
		info = x;
		left = lNode;
		right = rNode;
	}
	
	public TreeNode(int ... nodes) {			
		info = nodes[0];
		if(info == Integer.MIN_VALUE) return;
	
		int l = 1;			
		left = (nodes[l] == Integer.MIN_VALUE) ? null 
		  : new TreeNode(Arrays.copyOfRange(nodes, 1, nodes.length));
		
		int r = count(left) + 1;
		right = (nodes[r] == Integer.MIN_VALUE) ? null 
		  : new TreeNode(Arrays.copyOfRange(nodes, r, nodes.length));		
	}
	
	private int count(TreeNode tree) {
		if(tree == null) return 1;
		return 1 + count(tree.left) + count(tree.right);
	}
	
	public static TreeNode make(int ... nodes) {
		TreeNode tree = new TreeNode(nodes);
		if(tree.info == Integer.MIN_VALUE) tree = null;
		
		return tree;
	}
	
	public String toString() {
		String sub = "";
		sub += (left == null) ? "x" : left.toString();
		sub += " ";
		sub += (right == null) ? "x" : right.toString();
		return info + " " + sub;
	}
	
	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		TreeNode tree = new TreeNode(new int[]{8, 4, x, 6, x, x, 12, 10, x, x, 15, x, x});
		
		System.out.println(tree);
	}
}
