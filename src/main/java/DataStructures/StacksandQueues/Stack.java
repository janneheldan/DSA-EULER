package DataStructures.StacksandQueues;

/*
 * GENERIC STACK
 */
public class Stack <T> {
	private T[] stack;
	private int pointer;

	@SuppressWarnings("unchecked")
	public Stack() {
		stack = (T[]) new Object[10];
		pointer = 0;
	}

	public void push(T item) {
		if (pointer >= stack.length) {
			resize();
		}
		stack[pointer++] = item;
	}

	public void pop() {
		if (pointer > 0) {
			stack[--pointer] = null;
		}
	}

	public T get() {
		if (pointer > 0) {
			return (T) stack[pointer-1];
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private void resize() {
		T[] newStack = (T[]) new Object[stack.length * 2];
		System.arraycopy(stack, 0, newStack, 0, stack.length);
		stack = newStack;
	}
}
