package _06_generics._05_method;

import _04_io._04_ps.Cat;

public class Main {
    public static void main(String[] args) {
        DemoMethod.printArray("Bob", "Alise", "Tom", 15, new Cat("AAA", 5));

        String str = DemoMethod.concat("Petia", "Masha");
        System.out.println(str);
        Integer ages = DemoMethod.concat(25, 23);
        System.out.println(ages);
    }
}
