#include <iostream>
#include <fstream>
#include <string>
#include <math.h>

using namespace std;

/**
 * @brief 
 * 
 * @tparam T 
 * @param arr 
 * @param size 
 * @return T* 
 */
template <class T>
T* bubble_sort(T* arr, int size) {
    bool swapped;
    for (size_t i = 0; i < size - 1; i++)
    {
        for (size_t j = 0; j < size - 1 - i; j++)
        {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j+1]);
                swapped = true;
            }
        }

        if (swapped == false) {
            break;
        }
        
    }
    return arr;
}

int main() {
    int test[4] = {1, 5, 1, 2};
    int* result = bubble_sort<int>(test, 4);

    for(size_t i = 0; i < 4; i++)
    {
		cout << result[i] <<", "; 
    }	
    cout << endl;

	return 0;

}
