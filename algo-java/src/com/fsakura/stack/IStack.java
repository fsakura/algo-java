package com.fsakura.stack;

public interface IStack<E> {
	public E pop() throws Exception;

	public void push(E e);

	public boolean isEmpty();

	public int size();

	public E peek() throws Exception;
}
