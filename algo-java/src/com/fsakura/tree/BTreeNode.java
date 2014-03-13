package com.fsakura.tree;

public class BTreeNode<E> {
	public E e;
	public BTreeNode<E> left;
	public BTreeNode<E> right;

	public BTreeNode(E e) {
		this.e = e;
	}
}
