package Algorithms.SearchingAlgorithms;

import java.util.Objects; // Add the missing import statement

/**
 * LinearSearch
 */
public class LinearSearch {
	/**
	 * 
	 * @param <T> type is generic 
	 * @param array the array to be searched
	 * @param target the target to be searched
	 * @return the index of the target in the array, -1 if not found
	 */
	public static <T> int search(T[] array, T target) {
		if (array == null || target == null) {
			throw new IllegalArgumentException("Array or target cannot be null");
		}

		for (int i = 0; i < array.length; i++) {
			if (Objects.equals(array[i], target)) {
				return i;
			}
		}
		return -1;
	}
}
