package Algorithms.SearchingAlgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void testSearch() {
        // Test case 1: Integer array
        Integer[] array1 = {1, 2, 3, 4, 5};
        int target1 = 3;
        int expected1 = 2;
        int result1 = BinarySearch.search(array1, target1);
        assertEquals(expected1, result1);

        // Test case 2: String array
        String[] array2 = {"apple", "banana", "cherry", "date"};
        String target2 = "banana";
        int expected2 = 1;
        int result2 = BinarySearch.search(array2, target2);
        assertEquals(expected2, result2);

        // Test case 3: Empty array
        Integer[] array3 = {};
        int target3 = 5;
        int expected3 = -1;
        int result3 = BinarySearch.search(array3, target3);
        assertEquals(expected3, result3);

    }
}