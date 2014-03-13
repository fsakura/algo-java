package com.fsakura.queue;

import java.util.EmptyStackException;

public class ArrayQueue<E> implements IQueue<E> {

	private E[] elements;
	private int front, end, capacity, size;

	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		elements = (E[]) new Object[capacity];
		this.capacity = capacity;
		this.front = 0;
		this.end = 0;
		this.size = 0;
	}

	@Override
	public E remove() throws Exception {
		if (isEmpty())
			throw new EmptyStackException();
		E e = elements[front];
		elements[front] = null;
		front = (front + 1) % capacity;
		size--;
		return e;
	}

	@Override
	public void add(E e) throws Exception {
		if (isFull())
			throw new Exception("Queue is Full");
		elements[end] = e;
		end = (end + 1) % capacity;
		size++;
	}

	@Override
	public boolean isEmpty() {
		return 0 == size;
	}

	private boolean isFull() {
		return size == capacity;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E peek() throws Exception {
		if (isEmpty())
			throw new EmptyStackException();
		return elements[front];
	}

	public static void main(String[] args) throws Exception {
		IQueue<Integer> queue = new ArrayQueue<Integer>(10);
		for (int i = 0; i < 10; i++) {
			queue.add(i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(queue.size() + ":" + queue.peek() + ":"
					+ queue.remove() + ":" + queue.size());
		}
		// System.out.println(stack.peek() + ":" + stack.pop() + ":"
		// + stack.size());
		System.out.println(queue.remove() + ":" + queue.size());
	}
}
