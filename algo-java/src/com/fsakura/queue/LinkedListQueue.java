package com.fsakura.queue;

import com.fsakura.llist.Node;

public class LinkedListQueue<E> implements IQueue<E> {

	private Node<E> front;
	private Node<E> end;
	private int size;

	public LinkedListQueue() {
		this.front = null;
		this.end = null;
	}

	@Override
	public E remove() throws Exception {
		if (isEmpty())
			throw new Exception();
		E e = front.e;
		front = front.next;
		size--;
		if (isEmpty())
			end = null;
		return e;
	}

	@Override
	public void add(E e) throws Exception {
		Node<E> oldEnd = end;
		end = new Node<E>();
		end.e = e;
		end.next = null;
		if (isEmpty())
			front = end;
		else
			oldEnd.next = end;
		size++;
	}

	@Override
	public boolean isEmpty() {
		return null == front;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
