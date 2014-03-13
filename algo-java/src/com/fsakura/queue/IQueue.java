package com.fsakura.queue;

public interface IQueue<E> {
	public E remove() throws Exception;

	public void add(E e) throws Exception;

	public boolean isEmpty();

	public int size();

	public E peek() throws Exception;
}
