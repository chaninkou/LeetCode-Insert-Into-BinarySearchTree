package leetcode701;

public class Main {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(2);
		node.right = new TreeNode(7);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(3);
		
		int insertNode = 5;
		
		System.out.println("Given = [" + node.val + "," + node.left.val + "," + node.right.val + "," + node.left.left.val + "," + node.left.right.val + "]");
		
		System.out.println("Inserting: " + insertNode);
		
		BinarySearchTreeSolution binaryTree = new BinarySearchTreeSolution();
		
		TreeNode tree = binaryTree.insertIntoBST(node, insertNode);
		
		System.out.println("Final Tree: [" + tree.val + "," + tree.left.val + "," + tree.right.val + "," + tree.left.left.val + "," + tree.left.right.val + "," + tree.right.left.val + "]");
		

	}

}
