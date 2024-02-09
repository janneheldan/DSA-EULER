#include <iostream>

using namespace std;

/**
 * @brief 
 * 
 * @param n (palindrome number to be checked)
 * @return long (largest prime factor of n)
 */
long largestPrimeFactor(long long n) {
    long long i = 2;
    while (i * i <= n) {
        if (n % i) {
            i++;
        } else {
            n /= i;
        }
    }

    return n;
}


int main(int argc, char const *argv[])
{
    long long n = 600851475143;
    cout << largestPrimeFactor(n) << endl;
    return 0;
}
