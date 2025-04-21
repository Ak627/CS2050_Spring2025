public class binaryTree{
	public static void main(String [] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.Insert(12);
		tree.Insert(18);
		tree.Insert(1);
		tree.Insert(18);
		tree.Insert(22);
		tree.Insert(15);
	}
	
}
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data) {
		this.data = data;
	}
}

class BinarySearchTree{
	private TreeNode root;
	public BinarySearchTree() {
		root = null;
	}
	public void Insert(int value) {
		boolean pointfound = false;
		if(root == null) {
			root = new TreeNode(value);
			pointfound= true;
		}
		
		TreeNode currentNode = root;
		while(!pointfound) {
			if(value < currentNode.data) {
				if(currentNode.left == null) {
					currentNode.left = new TreeNode(value);
					pointfound = true;
				}
				else {
					currentNode = currentNode.left;
				}
			}
			else if(value > currentNode.data) {
				if(currentNode.right == null) {
					currentNode.right = new TreeNode(value);
					pointfound = true;
				}
				else {
					currentNode = currentNode.right;
				}
			}
			else if (value == currentNode.data) {
				System.out.println("DUPLICATE VALUE! CANNOT INSERT! Value: " + value + " CurrentNode: " + currentNode.data);
				pointfound = true;
			}
		}
	}

}
