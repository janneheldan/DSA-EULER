package Algorithms.SortingAlgorithms;

/*
 * GENERIC QUICK SORT
 */
public class QuickSort<T extends Comparable<T>> {

    public void quickSort(T[] arr, int lo, int hi) {
        if (lo >= hi || lo < 0) {
            return;
        }

        int pivot = partition(arr, lo, hi);
        quickSort(arr, lo, pivot - 1);
        quickSort(arr, pivot + 1, hi);
    }

    private int partition(T[] arr, int lo, int hi) {
		T pivot = medianOfThree(arr, lo, hi);
		int i = lo;
		int j = hi;

		while (true) {
			while (arr[i].compareTo(pivot) < 0) i++;
			while (arr[j].compareTo(pivot) > 0) j--;
			if (i >= j) return j;
			swap(arr, i, j);
		}
    }

	private T medianOfThree(T[] arr, int lo, int hi) {
		int mid = lo + (hi - lo) / 2;
		if (arr[lo].compareTo(arr[mid]) > 0) swap(arr, lo, mid);
		if (arr[lo].compareTo(arr[hi]) > 0) swap(arr, lo, hi);
		if (arr[mid].compareTo(arr[hi]) > 0) swap(arr, mid, hi);
		return arr[mid];
	}

	private void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}