/*
https://www.codewars.com/kata/5500d54c2ebe0a8e8a0003fd/train/java

Find the greatest common divisor of two positive integers.
The integers can be large, so you need to find a clever solution.

The inputs x and y are always greater or equal to 1,
so the greatest common divisor will always be an integer that is also greater or equal to 1.
 */

public class GreatestCommonDivisor {
    public static int compute(int x, int y) {
        int divisor = 1;
        for (int i = 1; i <= Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }
}
