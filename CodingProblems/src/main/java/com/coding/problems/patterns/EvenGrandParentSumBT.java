package com.coding.problems.patterns;

public class EvenGrandParentSumBT {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(final int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}

	static int sum = 0;

	static void evenGrandParentSum(final Node curr, final Node parent, final Node grandParent) {

		if (curr == null) {
			return;
		}

		if (null != grandParent && grandParent.data % 2 == 0) {
			sum = sum + curr.data;
		}
		evenGrandParentSum(curr.left, curr, parent);
		evenGrandParentSum(curr.right, curr, parent);

	}

	public static void main(String[] args) {
		final Node root = new Node(22);

		root.left = new Node(3);
		root.right = new Node(8);

		root.left.left = new Node(4);
		root.left.right = new Node(8);

		root.right.left = new Node(1);
		root.right.right = new Node(9);
		root.right.right.right = new Node(2);

		evenGrandParentSum(root, null, null);
		System.out.println(sum);
	}

}
