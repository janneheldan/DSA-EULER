#include <iostream>
#include <fstream>
#include <string>
#include <math.h>

using namespace std;


template <class T>
int binary_search(T arr[], int size, T t) 
{
    T L = 0;
    T R = size - 1;

    while (L <= R)
    {
        T m = floor((L + R) / 2);
        if (arr[m] < t) 
        {
            L = m + 1;
        } 
        else if (arr[m] > t) 
        {
            R = m - 1;
        }
        else {
            return 1;
        }
    }

    return 0;
}

int main() 
{
    int test[8] = {1, 4, 5, 7, 9, 12, 20, 25};

    int result = binary_search<int>(test, 8, 7);

    cout << result << endl;
};
