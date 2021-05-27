package code.war.datastructure;

public class Stack {

	private Node head;
	private int size;

	public void push(int value) {
		size++;
		if (head == null) {
			head = new Node(value);
			return;
		}
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public int pop() {
		int value = -1;
		if (head != null) {
			size--;
			value = head.value;
			head = head.next;
		}
		return value;
	}

	public int peek() {
		if (head != null) {
			return head.value;
		}
		return -1;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	private static class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}
}