package _03_exception._02_processing;


import static _03_exception._02_processing.Factorial.getFactorial;

public class Main3 {
    public static void main(String[] args) {
        try {
            System.out.println(getFactorial(-3));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
