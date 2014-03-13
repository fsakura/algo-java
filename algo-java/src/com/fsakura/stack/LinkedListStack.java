package com.fsakura.stack;

import java.util.EmptyStackException;

import com.fsakura.llist.Node;

public class LinkedListStack<E> implements IStack<E> {

	private int size;
	private Node<E> top;

	public LinkedListStack() {
		this.size = 0;
		top = null;
	}

	@Override
	public E pop() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException();
		E e = top.e;
		top = top.next;
		size--;
		return e;
	}

	@Override
	public void push(E e) {
		Node<E> oldTop = top;
		top = new Node<E>();
		top.e = e;
		top.next = oldTop;
		size++;
	}

	@Override
	public boolean isEmpty() {
		return (null == top);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E peek() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException();
		return top.e;
	}

	public static void main(String[] args) {
		IStack<Integer> stack = new LinkedListStack<Integer>();
		for (int i = 0; i < 20; i++) {
			stack.push(i);
		}
		for (int i = 0; i < 20; i++) {
			System.out.println(stack.peek() + ":" + stack.pop() + ":"
					+ stack.size());
		}
		// System.out.println(stack.peek() + ":" + stack.pop() + ":"
		// + stack.size());
		System.out.println(stack.pop() + ":" + stack.size());
	}
}
