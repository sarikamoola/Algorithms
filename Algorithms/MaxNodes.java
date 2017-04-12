package com.practice.algos;

import java.util.Arrays;


public class MaxNodes {
	 static TreeNode1 root;
	 int[] findMode(){
		 return findMode(root);
	 }
	public int[] findMode(TreeNode1 root) {
		inorder(root);
		modes = new int[modeCount];
		modeCount = 0;
		currCount = 0;
		inorder(root);
		return modes;
	}

	private int currVal;
	private int currCount = 0;
	private int maxCount = 0;
	private int modeCount = 0;

	private int[] modes;

	private void handleValue(int val) {
		if (val != currVal) {
			currVal = val;
			currCount = 0;
		}
		currCount++;
		if (currCount > maxCount) {
			maxCount = currCount;
			modeCount = 1;
		} else if (currCount == maxCount) {
			if (modes != null)
				modes[modeCount] = currVal;
			modeCount++;
		}
	}

	private void inorder(TreeNode1 root) {
		TreeNode1 node = root;
		while (node != null) {
			if (node.left == null) {
				handleValue(node.val);
				node = node.right;
			} else {
				TreeNode1 prev = node.left;
				while (prev.right != null && prev.right != node)
					prev = prev.right;
				if (prev.right == null) {
					prev.right = node;
					node = node.left;
				} else {
					prev.right = null;
					handleValue(node.val);
					node = node.right;
				}
			}
		}
	}

	public static void main(String arg[]) {
		MaxNodes b = new MaxNodes();

		b.root = new TreeNode1(1);
		b.root.left = new TreeNode1(2);
		b.root.right = new TreeNode1(3);
		b.root.left.left = new TreeNode1(3);
		b.root.left.right = new TreeNode1(5);
		int[] x=b.findMode(root);
		System.out.println(Arrays.toString(x));
		
	}

}

class TreeNode1 {
	int val;
	TreeNode1 left, right;

	public TreeNode1(int item) {
		val = item;
		left = right = null;
	}
}