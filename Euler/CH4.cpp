#include <iostream>
#include <cmath>

using namespace std;

/**
 * @brief 
 * 
 * @param n (number of digits in the numbers to be multiplied)
 * @return int (largest palindrome number that is a product of two n-digit numbers)
 */
int largestPalindrome(int n){
    if (n == 1) return 9;
    int max = pow(10, n) - 1;
    int min = pow(10, n - 1);

    for (int i = max; i >= min; i--){
        for (int j = i; j >= min; j--){
            int num = i * j;
            int temp = num;
            int reverse = 0;
            while (temp != 0){
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }
            if (num == reverse){
                if (num > max) max = num;
                break;
            }
        }
    }

    return max;
}

int main(int argc, char const *argv[])
{
    cout << largestPalindrome(3) << endl;
    return 0;
}

