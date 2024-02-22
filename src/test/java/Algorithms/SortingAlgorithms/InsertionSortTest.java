package Algorithms.SortingAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
	
	@Test
	public void testSort() {
		InsertionSort<Integer> insertionSort = new InsertionSort<>();
		
		// Test case 1: Sorting an array with integers
		Integer[] arr1 = {5, 2, 8, 1, 9};
		Integer[] expected1 = {1, 2, 5, 8, 9};
		Integer[] result1 = insertionSort.sort(arr1);
		Assertions.assertArrayEquals(expected1, result1);
	}
	
	@Test 
	public void testSortWithStrings() {
		InsertionSort<String> insertionSort = new InsertionSort<>();
		// Test case 2: Sorting an array with strings
		String[] arr2 = {"apple", "banana", "cherry", "date"};
		String[] expected2 = {"apple", "banana", "cherry", "date"};
		String[] result2 = insertionSort.sort(arr2);
		Assertions.assertArrayEquals(expected2, result2);
	}

	@Test
	public void testSortWithCharacters() {
		InsertionSort<Character> insertionSort = new InsertionSort<>();
		// Test case 3: Sorting an array with characters
		Character[] arr3 = {'e', 'a', 'd', 'b', 'c'};
		Character[] expected3 = {'a', 'b', 'c', 'd', 'e'};
		Character[] result3 = insertionSort.sort(arr3);
		Assertions.assertArrayEquals(expected3, result3);

	}
}