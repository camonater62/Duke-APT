package APT9;

import java.util.*;

public class SortedLeaves {
	
	public String[] values(TreeNode tree) {
		if(tree == null) return new String[0];
		TreeSet<String> current = new TreeSet<String>();
		if(tree.left == null && tree.right == null) current.add((char)tree.info + "");
		if(tree.left != null) current.addAll(Arrays.asList(values(tree.left)));
		if(tree.right != null) current.addAll(Arrays.asList(values(tree.right)));
		
		return current.toArray(String[] :: new);
	}

	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		TreeNode tree = TreeNode.make(new int[] {3, 73, 68, x, x, 85, x, x, 8, 77, 75, x, x, 69, x, x, x});
		
		System.out.println(Arrays.toString(new SortedLeaves().values(tree)));
	}

}
