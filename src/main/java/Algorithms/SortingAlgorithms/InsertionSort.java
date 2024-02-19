package Algorithms.SortingAlgorithms;

public class InsertionSort {
	/*
	 * Swaps the elements at the given indices
	 */
	private static <T> void swap(T[] array, int index1, int index2) {
		T hold = array[index1];
		array[index1] = array[index2];
		array[index2] = hold;
	}

	/**
	 * Insertion sort algorithm
	 * @param <T> generic type
	 * @param arr array to be sorted
	 * @return sorted array
	 */
	public <T extends Comparable<T>> T[] sort(T[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;	
			while (j >= 0 && arr[j].compareTo(arr[j + 1]) > 0) {
				swap(arr, j, j + 1);	
				j -= 1;
			}
		}

		return arr;
	}
}
