#include <iostream>


using namespace std;

/**
 * @brief 
 * 
 * @tparam T (generic type) 
 * @param n (number to sum up to n) 
 * @param arr (array of multiples to sum up to n)
 * @return T (sum of multiples)
 */
template <class T>
T sumOfMultiples(T n, T arr[]) {
    T sum = 0;
    for (T i = 0; i < n; i++) {
        if (i % arr[0] == 0 || i % arr[1] == 0) {
            sum += i;
        }
    }
    return sum;
}


int main(int argc, char const *argv[])
{
    int arr[] = {3, 5};
    cout << sumOfMultiples(1000, arr) << endl;
    return 0;
}
