package code.war.datastructure;

public class BinarySearchTree {
	private Node root;

	public void insert(int value) {
		if (root == null) {
			root = new Node(value, null, null);
			return;
		}
		root = insert(root, value);
	}

	private Node insert(Node node, int value) {
		if (node == null) {
			return new Node(value, null, null);
		} else if (node.value > value) {
			node.left = insert(node.left, value);
		} else if (node.value <= value) {
			node.right = insert(node.right, value);
		}
		return node;
	}

	public boolean find(int value) {
		if (root == null) {
			return false;
		}
		return find(root, value);
	}

	private boolean find(Node node, int value) {
		if (node != null) {
			if (node.value == value) {
				return true;
			}
			if (node.value > value) {
				return find(node.left, value);
			} else {
				return find(node.right, value);
			}
		}
		return false;
	}

	public int findMin() {
		if (root == null) {
			return -1;
		}
		Node node = root;
		while (node.left != null) {
			node = node.left;
		}
		return node.value;
	}

	public int findMax() {
		if (root == null) {
			return -1;
		}

		Node node = root;
		while (node.right != null) {
			node = node.right;
		}

		return node.value;
	}

	public void inOrderTraversal(Node node) {
		// Left, Root, Right
		if (node != null) {
			// Left
			inOrderTraversal(node.left);
			// Root
			System.out.println(node.value);
			// Right
			inOrderTraversal(node.right);
		}
	}

	public void preOrderTraversal(Node node) {
		// Root, Left, Right
		if (node != null) {
			// Root
			System.out.println(node.value);
			// Left
			preOrderTraversal(node.left);
			// Right
			preOrderTraversal(node.right);
		}
	}

	public void postOrderTraversal(Node node) {
		// Left, Right, Root
		if (node != null) {
			// Left
			postOrderTraversal(node.left);
			// Right
			postOrderTraversal(node.right);
			// Root
			System.out.println(node.value);
		}
	}

	public Node getRoot() {
		return root;
	}

	private static class Node {
		Node left;
		Node right;
		int value;

		Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}
}
