#include <iostream>

using namespace std;

/**
 * @brief Generic insertion sort algorithm
 * 
 * @tparam T (generic type)
 * @param arr (array of type T)
 * @param size (array size)
 */
template <class T>
void insertion_sort(T arr[], int size) 
{
	for (size_t i = 1; i < size; i++)
	{
		int j = i - 1;
		while (j >= 0 && arr[j] > arr[j+1]) 
		{
			swap(arr[j], arr[j+1]);
			j -= 1;
		}
	}
}

int main() {
	int test[4] = {1, 4, 3, 2};
	insertion_sort(test, 4);

	for (size_t i = 0; i < 4; i++)
	{
		cout << test[i] << endl;
	}

	return 0;
}
