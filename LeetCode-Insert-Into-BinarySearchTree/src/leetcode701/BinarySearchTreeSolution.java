package leetcode701;

public class BinarySearchTreeSolution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        
        if(node == null){
            node = new TreeNode(val);
            return node;
        }
        
        while(true){
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
