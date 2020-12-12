package APT10;

import java.util.Arrays;

public class AllPaths {
	
	public String[] paths(TreeNode t) {
		if(t == null) return new String[0];
		if(t.left == null && t.right == null) {
			return new String[] { t.info + "" };
		}
		
		String[] left = paths(t.left);
		String[] right = paths(t.right);
		String[] current = new String[left.length + right.length];
		
		int i = 0;
		for(String s : left)  current[i++] = t.info + "->" + s;
		for(String s : right) current[i++] = t.info + "->" + s;
		
		Arrays.sort(current);
		return current;
	}

	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		int[] nodes =  {1, 2, 3, x, x, 4, x, x, 5, x, 6, x, x} ;
		TreeNode t = TreeNode.make(nodes);
		
		String[] res = new AllPaths().paths(t);
		System.out.println(Arrays.toString(res));
	}

}
