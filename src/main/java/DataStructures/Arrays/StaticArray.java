package DataStructures.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StaticArray<T> {
	private T[] array;
	private int size;

	@SuppressWarnings("unchecked")
	public StaticArray(Class<T> type, int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be greater than 0");
		}

		array = (T[]) Array.newInstance(type, capacity);
		size = 0;
	}

	public int capacity() {
		return array.length;
	}

	public int size() {
		return size;
	}

	public void add(T item) {
		if (array.length == size) {
			throw new IllegalStateException("Array is full");
		}
		array[size++] = item;
	}

	public Object[] getArray() {
		return Arrays.copyOf(array, size);
	}

	public T get(int index) {
		checkIndex(index);	
		return array[index];
	}

	public void set(int index, T element) {
		checkIndex(index);
		array[index] = element;
	}

	public void remove(int index) {
		checkIndex(index);
		System.arraycopy(array, index + 1, array, index, size - index - 1);
		array[--size] = null;
	}

	private void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
	}
}
