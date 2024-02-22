package Algorithms.SortingAlgorithms;

/*
 * Bubble sort
 */
public class BubbleSort<T extends Comparable<T>>{
	/*
	 * Swaps the elements at the given indices
	 */
	private static <T> void swap(T[] array, int index1, int index2) {
		T hold = array[index1];
		array[index1] = array[index2];
		array[index2] = hold;
	}

	/**
	 * Bubble sort algorithm
	 * @param <T> generic type
	 * @param arr array to be sorted
	 * @return sorted array
	 */
	public T[] sort(T[] arr) {
		if (arr.length == 0) {
			return arr;
		}

		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					swap(arr, j, j + 1);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		return arr;
	}
}
