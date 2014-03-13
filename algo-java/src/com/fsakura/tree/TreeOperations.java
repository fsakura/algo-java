package com.fsakura.tree;

public class TreeOperations<E> {
	public BTreeNode<Integer> createTree() {
		BTreeNode<Integer> root = new BTreeNode<Integer>(4);
		BTreeNode<Integer> left = new BTreeNode<Integer>(3);
		BTreeNode<Integer> right = new BTreeNode<Integer>(6);

		System.out.println(this);
		// root.e = 4
		return null;
	}

	public static void main(String[] args) {
		System.out.println(new TreeOperations<>().createTree());
	}
}
