package com.fsakura.stack;

import java.util.EmptyStackException;

public interface IStack<E> {
	public E pop() throws EmptyStackException;

	public void push(E e);

	public boolean isEmpty();

	public int size();

	public E peek() throws EmptyStackException;
}
