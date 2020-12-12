package APT10;

public class TreeTighten {
	
	public TreeNode tighten(TreeNode t) {
		if(t == null) return null;
		if(t.left != t.right) {
			// Has at least one child
			
			if(t.left != null && t.right == null) {
				// Only left -> turn this into left
				t.right = t.left.right;
				t.info = t.left.info;
				t.left = t.left.left;
				tighten(t);
			} else if(t.left == null && t.right != null) {
				// Only right -> turn this into right
				t.left = t.right.left;
				t.info = t.right.info;
				t.right = t.right.right;
				tighten(t);
			} else {
				// Two children -> keep as is
			}
		} else {
			// No children -> keep as is
		}
		
		tighten(t.left);
		tighten(t.right);
		
		return t;
	}

	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		int[] nodes = {1, 2, x, x, x};
		TreeNode t = TreeNode.make(nodes);
		
		System.out.println(new TreeTighten().tighten(t));
	}

}
