package com.fsakura.llist;
public class ListOperations {

	public Node<Integer> reverse(Node<Integer> node) {
		if (null == node)
			return node;
		if (null == node.next)
			return node;
		Node<Integer> secondNode = node.next;
		node.next = null;
		Node<Integer> reverseNode = reverse(secondNode);
		secondNode.next = node;
		return reverseNode;
	}

	public static void main(String[] args) {
		ListOperations lo = new ListOperations();
		Node<Integer> head = lo.build123();
		lo.printList(head);
		head = lo.reverse(head);
		lo.printList(head);
	}

	public Node<Integer> build123() {
		Node<Integer> head = new Node<Integer>();
		Node<Integer> two = new Node<Integer>();
		Node<Integer> three = new Node<Integer>();

		head.e = 1;
		two.e = 2;
		three.e = 3;

		head.next = two;
		two.next = three;
		three.next = null;

		return head;
	}

	public void printList(Node<Integer> head) {
		while (null != head) {
			System.out.print(" " + head.e);
			head = head.next;
		}
		System.out.println("");
	}
}
