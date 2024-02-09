#include <iostream>

using namespace std;

/**
 * @brief 
 * 
 * @tparam T (generic type) 
 * @param n (limit to sum up to n) 
 * @return T (return sum of even fibonacci numbers up to n)
 */
template <typename T>
T evenFibonacciNumbers(T n) {
    T sum = 0;
    T a = 0;
    T b = 1;
    while (b < n) {
        if (b % 2 == 0) {
            sum += b;
        }
        T temp = a;
        a = b;
        b += temp;
    }
    return sum;
}


int main(int argc, char const *argv[])
{
    cout << evenFibonacciNumbers(4000000) << endl;
    return 0;
}
