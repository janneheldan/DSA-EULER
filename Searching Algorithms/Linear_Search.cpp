#include <iostream>
#include <fstream>
#include <string>

using namespace std;

/*
template <class T>
T openFile(T datatype) {
    fstream fin;

    fin.open('../Test_Data/searching.csv', ios::in);
    vector<string> row;



    return 
}
*/

/**
 * Function: linear_search
 * Template function for performing a linear search on an array.
 *
 * Parameters:
 * arr - The array to search.
 * size - The size of the array.
 * t - The value to search for.
 *
 * Returns:
 * 1 if the value is found in the array, 0 otherwise.
 */
template <class T, class Value>
Value linear_search(T arr[], int size, Value t) 
{
    for (size_t i = 0; i < size; i++) 
    {
        if (t == arr[i])
        {
            return 1;
        }
        
    }
    return 0;
}


int main() {

    int test [4] = {1, 3, 4, 5};
    int result = linear_search<int>(test, 4, 3);
    cout << result << endl;


    return 0;
};