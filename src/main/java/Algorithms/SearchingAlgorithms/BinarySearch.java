package Algorithms.SearchingAlgorithms;

/*
 * BinarySeach
 */
public class BinarySearch {

	/**
	 * BinarySeach 
	 * @param <T>
	 * @param array
	 * @param target
	 * @return the index of the target in the array, -1 if not found
	 */
	public static <T extends Comparable <T>> int search(T[] array, T target) {
		if (array == null || target == null) {
			throw new IllegalArgumentException("Array or target cannot be null");
		}

		int size = array.length;
		int L = 0;
		int R = size - 1;
		while (L <= R) {
			int m = (L + R) / 2;
			if (array[m].compareTo(target) < 0) {
				L = m + 1;
			} else if (array[m].compareTo(target) > 0) {
				R = m - 1;
			} else {
				return m;
			}
		}
		return -1;
	}
}
