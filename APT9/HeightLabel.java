package APT9;

public class HeightLabel {

	public TreeNode rewire(TreeNode t) {
		if(t == null) return t;
		
		TreeNode newNode = new TreeNode(0);			
			
		if(t.left == null && t.right == null) {
			newNode.info = 1;
		} else {
			newNode.left = rewire(t.left); 
			newNode.right = rewire(t.right);
			
			int lval = (newNode.left == null) ? 0 : newNode.left.info;
			int rval = (newNode.right == null) ? 0 : newNode.right.info;
			
			newNode.info = Math.max(lval, rval) + 1;
		}
		
		return newNode;
	}
	
	
	
	public static void main(String[] args) {
		int x = Integer.MIN_VALUE;
		TreeNode t = TreeNode.make(new int[] {1,2,3,x,x,x,4,5,6,x,x,7,x,x,8,x,x});
		TreeNode res = new HeightLabel().rewire(t);
		
		System.out.println(res);
	}

}
