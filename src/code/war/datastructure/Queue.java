package code.war.datastructure;

public class Queue {
	private Node head;
	private Node tail;
	private int size;

	public void push(int value) {
		size++;
		Node newNode = new Node(value);
		if (tail != null) {
			tail.next = newNode;
		}
		tail = newNode;

		if (head == null) {
			head = tail;
		}
	}

	public int pop() {
		int value = -1;
		if (head != null) {
			value = head.value;
			head = head.next;
			size--;
		}

		return value;
	}

	public int peek() {
		if (head != null) {
			return head.value;
		}
		return -1;
	}

	public void delete(int value) {
		if (head != null) {
			if (head.value == value) {
				head = head.next;
				size--;
				return;
			}

			Node currentNode = head;
			while (currentNode != null && currentNode.next != null) {
				if (currentNode.next.value == value) {
					currentNode.next = currentNode.next.next;
					size--;
					break;
				}
				currentNode = currentNode.next;
			}
		}

	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.value + ", ");
			current = current.next;
		}
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
