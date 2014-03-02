package com.fsakura.stack;

import java.util.Arrays;

public class ArrayStack<E> implements IStack<E> {

	private E[] elements;
	private int top;
	private int capacity;

	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		elements = (E[]) new Object[capacity];
		this.capacity = capacity;
		top = 0;
	}

	@Override
	public E pop() throws Exception {
		if (this.isEmpty())
			throw new Exception("Stack is Empty");
		E e = elements[--top];
		elements[top] = null;
		return e;
	}

	@Override
	public void push(E e) {
		if (top == capacity) {
			ensurecapa();
		}
		elements[top++] = e;
	}

	private void ensurecapa() {
		capacity = 2 * capacity;
		elements = Arrays.copyOf(elements, capacity);
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {
		return top;
	}

	@Override
	public E peek() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is Empty");
		return elements[top - 1];
	}

	public static void main(String[] args) throws Exception {
		IStack<Integer> stack = new ArrayStack<Integer>(10);
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
