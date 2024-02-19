package Euler;

public class CH2 {

    /*
     * Even fibonacci numbers
     */
    public static int evenFibonacciNumbers(int limit) {
        int a = 0;
        int b = 1;
        int sum = 0;
        while (a < limit) {
            if (a % 2 == 0) {
                sum += a;
            }
            int swap = b;
            b += a;
            a = swap;
        }
        return sum;
    }

    public static void main(String[] args) {
        long result = evenFibonacciNumbers(4000000);
        System.out.println("Answer: " + result);
    }
}
