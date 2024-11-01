package _06_generics._04_interfase;


import _04_io._04_ps.Cat;

public class Main {
    public static void main(String[] args) {
        var strong = new StrongBox("First");
        String strValue = strong.doSmth();

        var soft = new SoftBox<>(new Cat("Vasia", 10));
        System.out.println(soft.doSmth());
    }
}
