
public class MinimalTree {

	public static void main(String[] args) {
		int[] input = new int[]{1,2,3,4,5,6,7,8};
		createBST(input, 0, input.length-1);
	}

	private static void createBST(int[] in, int start, int end) {
		int mid = (end-start)/2;
		TreeNode newNode = new TreeNode(in[mid]);
		
	}

}
