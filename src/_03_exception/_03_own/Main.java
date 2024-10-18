package _03_exception._03_own;


import java.util.Scanner;

import static _03_exception._03_own.Factorial1.getFactorial;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            try {
                System.out.println(getFactorial(sc.nextInt()));
            }catch (FactorialException e) {
                System.out.println(e.getMessage() + e.getNumber());
            }
        }
        try {
            System.out.println(getFactorial(-3));
        }catch (FactorialException e) {
            System.out.println(e.getMessage() + e.getNumber());
        }
    }
}
