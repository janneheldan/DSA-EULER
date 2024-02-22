package Algorithms.SortingAlgorithms;

import java.util.Arrays;

/*
 * Generic Merge sort
 */
public class MergeSort<T extends Comparable <T>> {

	public T[] merge_sort(T[] m) {
		if (m.length <= 1) {
			return m;
		}

		T[] left = Arrays.copyOfRange(m, 0, m.length / 2);
		T[] right = Arrays.copyOfRange(m, m.length / 2, m.length);

		int index = 0;
		for (T t : m) {
			if (index < (m.length / 2)) {
				left[index] = t;
			} else {
				right[index - m.length / 2] = t;
			}
			index++;
		}

		left = merge_sort(left);
		right = merge_sort(right);

		return merge(left, right);
	}

	public T[] merge(T[] left, T[] right) {
        T[] result = Arrays.copyOf(left, left.length + right.length);
        int i = 0, leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
                result[i++] = left[leftIndex++];
            } else {
                result[i++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            result[i++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[i++] = right[rightIndex++];
        }

        return result;
    }
}
