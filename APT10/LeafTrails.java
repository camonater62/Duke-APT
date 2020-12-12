package APT10;

import java.util.*;

public class LeafTrails {
	
	private int getVal(TreeNode t, String path) {
		if(path.length() == 0) return t.info;
		TreeNode next = (path.charAt(0) == '0') ? t.left : t.right;
		return getVal(next, path.substring(1));
	}
	
	public String[] trails(TreeNode tree) {
		if(tree == null) return new String[0];
		
		if(tree.left == tree.right) {  
			return new String[] { "" };	// This is an end
		} 
		
		String[] left = trails(tree.left);
		String[] right = trails(tree.right);
		
		String[] current = new String[left.length + right.length];
		
		int index = 0;
		for(String s : left)  current[index++] = "0" + s;
		for(String s : right) current[index++] = "1" + s;
		
		Arrays.sort(current, (a, b) -> getVal(tree, a) - getVal(tree, b));
		
		return current;
	}
	
	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		int[] nodes = {3, 73, 68, x, x, 85, x, x, 8, 77, 75, x, x, 69, x, x, x};
		TreeNode tree = TreeNode.make(nodes);
		
		System.out.println(
				Arrays.toString(new LeafTrails().trails(tree))
		);
	}

}
