#include <iostream>

using namespace std;

template <typename T>
void bubble_sort(T arr[], int n)
{
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = 0; j < n - i - 1; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				swap(arr[j], arr[j + 1]);
			}
		}
	}
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
	bubble_sort<int>(arr, 9);
	bubble_sort<char>(arr2, 9);
	print_array(arr, 9);
	print_array(arr2, 9);
	return 0;
}
