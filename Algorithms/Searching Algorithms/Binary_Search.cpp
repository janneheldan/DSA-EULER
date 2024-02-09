#include <iostream>

using namespace std;

/**
 * @brief 
 * 
 * @tparam T (generic type)
 * @param arr (sorted array of type T)
 * @param n	(size of the array) 
 * @param key (key to be searched in the array) 
 * @return int (if key is found in the array, return the index of the key, otherwise return -1)
 */
template <typename T>
int binary_search(T arr[], int n, T key)
{
	int start = 0;
	int end = n - 1;
	while (start <= end)
	{
		int mid = start + (end - start) / 2;
		if (arr[mid] == key)
		{
			return mid;
		}
		else if (arr[mid] < key)
		{
			start = mid + 1;
		}
		else
		{
			end = mid - 1;
		}
	}
	return -1;
}


int main(int argc, char const *argv[])
{
	int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	char arr2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
	cout << binary_search(arr, 9, 5) << endl; 
	cout << binary_search(arr2, 9, 'e') << endl;
	return 0;
}
