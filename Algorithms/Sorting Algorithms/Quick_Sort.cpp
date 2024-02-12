#include <iostream>

using namespace std;

/**
 * @brief Generic quick sort algorithms 
 * 
 * @tparam T (generic type) 
 * @param arr (array of type T)
 * @param start (start index of the array)
 * @param end (end index of the array) 
 */
template <typename T>
void quick_sort(T arr[], int start, int end)
{
	if (start >= end)
	{
		return;
	}
	int pivot = start;
	int i = start + 1;
	int j = end;
	while (i <= j)
	{
		if (arr[i] <= arr[pivot])
		{
			i++;
		}
		else if (arr[j] > arr[pivot])
		{
			j--;
		}
		else
		{
			swap(arr[i], arr[j]);
		}
	}
	swap(arr[pivot], arr[j]);
	quick_sort(arr, start, j - 1);
	quick_sort(arr, j + 1, end);
}

template <typename T>
void print_array(T arr[], int n)
{
	for (int i = 0; i < n; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
}

int main(int argc, char const *argv[])
{
	int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
	char arr2[] = {'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
	quick_sort<int>(arr, 0, 8);
	quick_sort<char>(arr2, 0, 8);
	print_array(arr, 9);
	print_array(arr2, 9);
	return 0;
}
