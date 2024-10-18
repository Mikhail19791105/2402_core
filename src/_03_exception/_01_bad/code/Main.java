package _03_exception._01_bad.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter only numbers!!!!");
        var sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            try {
                var number = parseInt(sc.nextLine());
                if (number == 0) {
                    System.exit(0);
                }
                System.out.println(number);
                }catch (Exception e) {
                    System.err.println(e.getMessage());
            }
        }
    }

    private static  int parseInt(String str) throws Exception {
        if (str.matches("\\d+")) {
            throw new Exception("Only numbers, stupid...");
            }
        return Integer.parseInt(str);
        }
    }

