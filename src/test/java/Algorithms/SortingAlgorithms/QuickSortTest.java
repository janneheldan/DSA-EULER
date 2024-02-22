package Algorithms.SortingAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

	@Test
	public void testQuickSortInt() {
		QuickSort<Integer> quickSort = new QuickSort<>();
		Integer[] arr1 = { 5, 2, 8, 1, 9 };
		Integer[] expected1 = { 1, 2, 5, 8, 9 };
		quickSort.quickSort(arr1, 0, arr1.length - 1);
		Assertions.assertArrayEquals(expected1, arr1);
	}

	@Test
	public void testQuickSortChar() {
		QuickSort<Character> quickSort = new QuickSort<>();
		Character[] arr = { 'c', 'a', 'e', 'd', 'b' };
		Character[] expected = { 'a', 'b', 'c', 'd', 'e' };
		quickSort.quickSort(arr, 0, arr.length - 1);
		Assertions.assertArrayEquals(expected, arr);
	}

	@Test 
	public void testQuickSortString() {
		QuickSort<String> quickSort = new QuickSort<>();
		String[] arr = { "c", "a", "e", "d", "b" };
		String[] expected = { "a", "b", "c", "d", "e" };
		quickSort.quickSort(arr, 0, arr.length - 1);
		Assertions.assertArrayEquals(expected, arr);
	}

	@Test
	public void testQuickSortWithEmptyArray() {
		QuickSort<Integer> quickSort = new QuickSort<>();
		Integer[] arr = {};
		Integer[] expected = {};
		quickSort.quickSort(arr, 0, arr.length - 1);
		Assertions.assertArrayEquals(expected, arr);
	}

	@Test
	public void testQuickSortPerformance() {
		QuickSort<Integer> quickSort = new QuickSort<>();
		Integer[] arr = new Integer[100000];
		Integer[] expected = new Integer[100000];
		
		for (int i = 0; i < 100000; i++) {
			arr[i] = 100000 - i;
			expected[i] = i + 1;
		}

		long start = System.currentTimeMillis();
		quickSort.quickSort(arr, 0, arr.length - 1);
		long end = System.currentTimeMillis();
		System.out.println("QuickSort: " + (end - start) + "ms");
		Assertions.assertArrayEquals(expected, arr);
	}
}