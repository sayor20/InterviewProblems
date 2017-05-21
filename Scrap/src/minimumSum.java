import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumSum {
	public static void main(String args[]){
		int[][] matrix = new int[][]{
									{1,2,3},
									{4,5,6},
									{7,8,9}
						 };
						 
						 
		System.out.println(Arrays.deepToString(matrix));
		System.out.println(findMinimumSumOfPath(matrixToTree(matrix), new ArrayList<TreeNode>()));
	}
	
	public static TreeNode matrixToTree(int[][] input){
	    TreeNode root = createTreeNode(input,0, 0);
	    return root;
	}

	private static TreeNode createTreeNode(int[][] input, int ind1, int ind2){
	    if(ind1<=input.length-1 && ind2<input.length-1){
	        Integer value = input[ind1][ind2+1];
	        if(value!=null){
	            TreeNode t = new TreeNode(value);
	            t.left = createTreeNode(input, ind1+1, ind2);
	            t.right = createTreeNode(input, ind1, ind2+1);
	            return t;
	        }
	    }
	    return null;
	}
	
	public static int findMinimumSumOfPath( TreeNode root, List<TreeNode> path)
	{
	    if (root.left ==null && root.right==null) {
	     path.add(root);
	     return root.val;
	    }
	    
	    List<TreeNode> leftPath = new ArrayList<TreeNode>();
	    List<TreeNode> rightPath = new ArrayList<TreeNode>();
	    int leftSum= Integer.MAX_VALUE;
	    int rightSum=Integer.MAX_VALUE;
	    int sum=0;
	    
	    if (root.left!=null) 
	     leftSum = findMinimumSumOfPath ( root.left, leftPath );
	    if (root.right!=null) 
	         rightSum = findMinimumSumOfPath ( root.right, rightPath);
	    if (leftSum < rightSum) {
	         path.add(root);
	         path.addAll(leftPath);
	         sum = root.val+leftSum;
	    } 
	    else {
	         path.add(root);
	         path.addAll(rightPath);
	         sum = root.val+rightSum;
	    }
	    return sum;
	}
	
}



