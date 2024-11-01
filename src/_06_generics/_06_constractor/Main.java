package _06_generics._06_constractor;

import _04_io._04_ps.Cat;

public class Main {
    public static void main(String[] args) {
        var strangeBox = new StrangeBox(new Cat("Vaska", 4));
        System.out.println(strangeBox.doSmth());
    }
}
