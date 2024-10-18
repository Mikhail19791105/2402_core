package _03_exception._02_processing;

public class Factorial {
    public static int getFactorial(int number) throws Exception {
        if (number < 0) throw new Exception("Number must be more than 0");
        var result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        return result;
    }
}
