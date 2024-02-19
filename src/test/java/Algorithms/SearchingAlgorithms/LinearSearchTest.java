package Algorithms.SearchingAlgorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class LinearSearchTest {

    @Test
    public void testSearch() {
        // Test case 1
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer target1 = 3;
        int expected1 = 2;
        int result1 = LinearSearch.search(array1, target1);
        assertEquals(expected1, result1);

        // Test case 2
        String[] array2 = {"apple", "banana", "orange"};
        String target2 = "banana";
        int expected2 = 1;
        int result2 = LinearSearch.search(array2, target2);
        assertEquals(expected2, result2);

        // Test case 3
        Double[] array3 = {1.5, 2.5, 3.5, 4.5};
        Double target3 = 2.5;
        int expected3 = 1;
        int result3 = LinearSearch.search(array3, target3);
        assertEquals(expected3, result3);

        // Test case 4
        Integer[] array4 = {1, 2, 3, 4, 5};
        Integer target4 = 6;
        int expected4 = -1;
        int result4 = LinearSearch.search(array4, target4);
        assertEquals(expected4, result4);

    }
}