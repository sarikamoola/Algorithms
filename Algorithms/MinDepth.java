package com.practice.algos;

class TreeNode {
	int data;
	TreeNode left, right;

	public TreeNode(int item) {
		data = item;
		left = right = null;
	}
}

public class MinDepth {
	TreeNode root;

	int minimumDepth() {
		return minimumDepth(root);
	}

	public static int minimumDepth(TreeNode root) {

		if (root == null)
			return 0;
		if (root.left == null)
			return minimumDepth(root.right) + 1;
		if (root.right == null)
			return minimumDepth(root.left) + 1;
		if (root.right == null && root.left == null)
			return 1;

		return Math.min(minimumDepth(root.left), minimumDepth(root.right)) + 1;

	}

	public static void main(String args[]) {
		MinDepth tree = new MinDepth();

		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);

		System.out.println(" minimum depth of " + "binary tree is : "
				+ tree.minimumDepth());
	}
}
