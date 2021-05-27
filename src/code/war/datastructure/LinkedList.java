package code.war.datastructure;

public class LinkedList {
	private Node head;
	private int size;

	public void addFront(int value) {
		size++;
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addBack(int value) {
		size++;
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public int getFirst() {
		if (head == null) {
			return -1;
		}
		return head.value;
	}

	public int getLast() {
		Node current = head;
		if (current == null) {
			return -1;
		}
		while (current.next != null) {
			current = current.next;
		}
		return current.value;
	}

	public void delete(int value) {
		if (head != null) {
			if (head != null && head.value == value) {
				head = head.next;
				size--;
				return;
			}
			Node currentNode = head;
			while (currentNode.next != null) {
				if (currentNode.next.value == value) {
					currentNode.next = currentNode.next.next;
					size--;
					break;
				}
				currentNode = currentNode.next;
			}
		}
	}

	public int size() {
		return this.size;
	}

	public void clear() {
		head = null;
		size = 0;
	}

	private static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}
}
