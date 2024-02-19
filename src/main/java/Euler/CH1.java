package Euler;

public class CH1 {

    /*
     * Multiples of 3 or 5 
     */
    public static int multiplesOfThreeOrFive(int limit) {
        int result = 0;
        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int ans = multiplesOfThreeOrFive(1000);
        System.out.println("Answer: " + ans);
    }
}
