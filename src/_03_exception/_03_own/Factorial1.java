package _03_exception._03_own;

public class Factorial1 {
    public static int getFactorial(int number) throws FactorialException {
        int result = 1;
        if (number < 1)   throw new FactorialException("Number is > 1, yor entered ", number);
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        return result;
    }
}
