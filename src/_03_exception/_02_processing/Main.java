package _03_exception._02_processing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        try  {
            numbers[4] = Integer.parseInt("123");
            System.out.println(numbers[4]);
        } catch (NumberFormatException | IllegalStateException e) {
           System.err.println("Only digit!!!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("More than size");
        }
        finally {
            System.out.println("Inside Finally");
        }
        System.out.println("Finished");
    }
}

