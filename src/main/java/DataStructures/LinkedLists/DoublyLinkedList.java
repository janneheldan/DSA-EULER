package DataStructures.LinkedLists;

/*
 * GENERIC DOUBLY LINKED LIST 
 */
public class DoublyLinkedList<T extends Comparable<T>> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public DoublyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data, first, null);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.setPrevious(newNode);
        }
        first = newNode;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T data = first.getData();
        first = first.getNext();
        if (first != null) {
            first.setPrevious(null);
        } else {
            last = null;
        }
        size--;
        return data;
    }

    public T getFirst() {
        return isEmpty() ? null : first.getData();
    }

    public T getLast() {
        return isEmpty() ? null : last.getData();
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data, null, last);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

	/*
	 * Node class for the doubly linked list
	 */
    private static class Node<T> {
        private Node<T> next;
        private Node<T> previous;
        private T data;

        public Node(T data, Node<T> next, Node<T> previous) {
            setData(data);
            setNext(next);
            setPrevious(previous);
        }

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getPrevious() {
			return previous;
		}

		public void setPrevious(Node<T> previous) {
			this.previous = previous;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
    }
}
