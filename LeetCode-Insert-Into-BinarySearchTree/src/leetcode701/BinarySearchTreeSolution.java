package leetcode701;

public class BinarySearchTreeSolution {
	// worst case O(n) to search/insert/delete, O(h) is average where h is the height
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        
        if(node == null){
            node = new TreeNode(val);
            return node;
        }
        
        while(node != null){
            if(val >= node.val){
                if(node.right != null){
                    node = node.right;
                    continue;
                } else{
                    node.right = new TreeNode(val);
                    break;
                }
            } else {
                if(node.left != null){
                    node = node.left;
                    continue;
                } else{
                    node.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
