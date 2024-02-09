#include <iostream>

using namespace std;

/**
 * @brief 
 * 
 * @tparam T (generic type) 
 * @param arr (array to be searched) 
 * @param n (array size) 
 * @param key (key to be searched in the array)
 * @return int (if key is found in the array, return the index of the key, otherwise return -1)
 */
template <typename T>
int linear_search(T arr[], int n, T key)
{
	for (int i = 0; i < n; i++)
	{
		if (arr[i] == key)
		{
			return i;
		}
	}
	return -1;
}

int main(int argc, char const *argv[])
{
	int test_data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	char test_data2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
	int resutl = linear_search<int>(test_data, 9, 5);
	int resutl2 = linear_search<char>(test_data2, 9, 'z');

	cout << resutl << endl;
	cout << resutl2 << endl;
}
