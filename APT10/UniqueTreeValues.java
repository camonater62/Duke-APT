package APT10;

import java.util.*;

public class UniqueTreeValues {
	
	public int[] unique(TreeNode root) {
		if(root == null) {
			return new int[0];
		}
		TreeSet<Integer> values = new TreeSet<Integer>();
		values.add(root.info);
		for(int i : unique(root.left)) {
			values.add(i);
		}
		for(int i : unique(root.right)) {
			values.add(i);
		}
		int[] res = new int[values.size()];
		int i = 0;
		for(int v : values) {
			res[i++] = v;
		}
		return res;
	}

	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		TreeNode root = new TreeNode(new int[]{1,2,3,4,x,x,x,x,x});
		
		System.out.println(Arrays.toString(new UniqueTreeValues().unique(root)));
	}

}
