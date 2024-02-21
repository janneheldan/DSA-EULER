package DataStructures.LinkedLists;

/*
 * GENERIC SINGLY LINKED LIST
 */
public class SinglyLinkedList<T> {
	private Node<T> first;

	public SinglyLinkedList() {
		first = null;
	}

	/*
	 * Add a new node to the beginning of the list
	 */
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data, first);
		first = newNode;
	}

	/*
	 * Remove the first node from the list
	 */
	public T removeFirst() {
		if (isEmpty()) {
			return null;
		}
		T data = first.getData();
		first = first.getNext();
		return data;
	}

	/*
	 * Return the first node in the list
	 */
	public T getFirst() {
		if (isEmpty()) {
			return null;
		}
		return first.getData();
	}

	/*
	 * Return the last node in the list
	 */
	public T getLast() {
		if (isEmpty()) {
			return null;
		}
		Node<T> currentNode = first;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}

	/*
	 * Add a new node to the end of the list
	 */
	public void addLast(T data) {
		if (isEmpty()) {
			addFirst(data);
		} else {
			Node<T> currentNode = first;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			Node<T> newNode = new Node<>(data, null);
			currentNode.setNext(newNode);
		}
	}

	/*
	 * Return the size of the list
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Inner class representing the nodes of the linked list
	 */
	private static class Node <T> {
		private T first;
		private Node<T> next;

		public Node(T data, Node<T> next) {
			setData(data);
			setNext(next);
		}

		public T getData() {
			return first;
		}

		public void setData(T data) {
			this.first = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
}
