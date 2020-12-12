package APT10;

import java.util.*;

public class LeafCollector {
	
	public String trim(TreeNode tree) {
		if(tree == null) return "";
		if(tree.left == tree.right) return tree.info + "";
		
		String left = trim(tree.left);
		if(left.length() > 0 && !left.contains(" ") 
		&& Integer.parseInt(left) == tree.left.info) {
			tree.left = null; // remove this node
		}
		
		String right = trim(tree.right);
		if(right.length() > 0 && !right.contains(" ")
		&& Integer.parseInt(right) == tree.right.info) {
			tree.right = null; // remove this node
		}
		
		return String.join(" ", left, right);
	}
	
	public String[] getLeaves(TreeNode tree) {
		ArrayList<String> layers = new ArrayList<String>();
		while(tree.left != tree.right) {
			layers.add(trim(tree).trim());
		}
		layers.add(Integer.toString(tree.info));
		return layers.toArray(String[]::new);
	}

	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		int[] nodes = {8, 4, x, 6, x, x, 12, 10, x, x, 15, x, x};
		TreeNode tree = TreeNode.make(nodes);
		
		System.out.println(Arrays.toString(new LeafCollector().getLeaves(tree)));
	}

}
