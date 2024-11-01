package _06_generics._01_precandition;

import _04_io._04_ps.Cat;

public class Main {
    public static void main(String[] args) {
        var array = new Object[] {"Hello", 15, new Cat("Vaska", 5)};
        //String str = array[0];
        //var str = array[0];
        //str.getBytes();
        var str = (String) array[0];
        str.getBytes();

        var str1 = array[1];
        //str1.getBytes();
        if (str1 instanceof String) {
            ((String) str1).getBytes();
        }else {
            System.out.println("Kosiak");
        }
    }
}
