package Algorithms.SortingAlgorithms;
// BubbleSort.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSort() {
        Integer[] arr = {5, 4, 3, 2, 1, 0};
        Integer[] expected = {0, 1, 2, 3, 4, 5};
        Integer[] sorted = bubbleSort.sort(arr);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithDuplicates() {
        Integer[] arr = {5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5};
        Integer[] expected = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        Integer[] sorted = bubbleSort.sort(arr);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithEmptyArray() {
        Integer[] arr = {};
        Integer[] expected = {};
        Integer[] sorted = bubbleSort.sort(arr);
        assertArrayEquals(expected, sorted);
    }
}