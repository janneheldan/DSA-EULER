package Algorithms.SortingAlgorithms;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        MergeSort<Integer> mergeSort = new MergeSort<>();

        Integer[] input = {5, 2, 8, 1, 9};
        Integer[] expected = {1, 2, 5, 8, 9};
        Integer[] result = mergeSort.merge_sort(input);

        Assertions.assertArrayEquals(expected, result);
    }

	@Test
	public void testMergeSortWithNegativeNumbers() {
		MergeSort<Integer> mergeSort = new MergeSort<>();

		Integer[] input = {5, -2, 8, 1, -9};
		Integer[] expected = {-9, -2, 1, 5, 8};
		Integer[] result = mergeSort.merge_sort(input);

		Assertions.assertArrayEquals(expected, result);
	}

	@Test
	public void testMergeSortWithEmptyArray() {
		MergeSort<Integer> mergeSort = new MergeSort<>();

		Integer[] input = {};
		Integer[] expected = {};
		Integer[] result = mergeSort.merge_sort(input);

		Assertions.assertArrayEquals(expected, result);
	}

	@Test
	public void testPerformance() {
		MergeSort<Integer> mergeSort = new MergeSort<>();
		Integer[] input = new Integer[10000000];
		Integer[] expected = new Integer[10000000];
		for (int i = 0; i < 10000000; i++) {
			input[i] = (int) (Math.random() * 1000000);
		}
		System.arraycopy(input, 0, expected, 0, input.length);
		long start = System.currentTimeMillis();
		mergeSort.merge_sort(input);
		long end = System.currentTimeMillis();
		System.out.println("MergeSort: " + (end - start) + "ms");

		start = System.currentTimeMillis();
		Arrays.sort(expected);
		end = System.currentTimeMillis();
		System.out.println("Arrays.sort: " + (end - start) + "ms");
	}
}