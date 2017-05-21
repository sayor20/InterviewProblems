import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Codex {
	
	 // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root!=null){
        	StringBuilder sb = new StringBuilder();
            serializeBST(root, sb);
            System.out.println(sb.toString());
            return sb.toString();
        }
        return "";
    }
    
    public void serializeBST(TreeNode root, StringBuilder sb){
        if(root==null){
        	sb.append("X"+",");
        }else{
        sb.append(root.val+ ",");
        serializeBST(root.left, sb);
        serializeBST(root.right, sb);
        }
    }
    
/*	 // Decodes a tree to a single string.
    public void deserialize(String data) {
    	String[] sArr = data.split(",");
    	TreeNode root = new TreeNode(Integer.parseInt(sArr[0]));
    	for(int i=1;i<sArr.length;i++){
    		root.left = new TreeNode(Integer.parseInt(sArr[i]));
    		root.right = 
    	}	
    }
 */
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<String>();
        String[] sArr = (data.split(","));
        return buildTree(sArr, 0);
    }
    
    private TreeNode buildTree(String[] nodes , int i) {
    	String val = "";
    	if(i<nodes.length){
    		val = nodes[i];
    		i++;
    	}
    		
        if (val.equals("X")) return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes, i);         
            node.right = buildTree(nodes, i);
            return node;
        }
    }
    
    public static int findKthSmallest(TreeNode root, int count, int k){
		if(root==null)
			return -1;
		int left = findKthSmallest(root.left, count, k);
		if(left!=-1)
			return left;
		
		if(count==k)
			 return root.val;
		else
			++count;
		
		int right = findKthSmallest(root.right, count, k);
		if(right!=-1)
			return right;
		return -1;
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(11);
		root.left = new TreeNode(7);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(20);
		root.left.left.left = new TreeNode(2);
		root.left.left.right = new TreeNode(3);
		root.left.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(8);
		root.left.right.right = new TreeNode(10);
		
		System.out.println(findKthSmallest(root,0,2));
		
		//Codex codex = new Codex();
		//codex.serialize(codex.deserialize(codex.serialize(root)));
	}

}



