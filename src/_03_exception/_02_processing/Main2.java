package _03_exception._02_processing;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        try {
            if (sc.nextInt() > 30) {
                throw new IllegalArgumentException("Number must be less than 30");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Finished");
    }
}

