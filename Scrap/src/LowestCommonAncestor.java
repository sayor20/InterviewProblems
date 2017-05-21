
public class LowestCommonAncestor {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		//System.out.println(lowestCommonAncestor(root, root.left, root.left.right.left).val);
		System.out.println(maxDepth(root));
	}
	
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return (left == null ? right : (right == null ? left : root));
    }
    
        
    public static int maxDepth(TreeNode root){
            return maxDep(root, 0, 0);
    }
    
    public static int maxDep(TreeNode root, int max, int count) {
        if(root==null){
            return count++;
            
        }
        	max = Math.max(max, maxDep(root.left, max, count));
            max = Math.max(max, maxDep(root.right, max, count));
            return max;
    }
    
}
