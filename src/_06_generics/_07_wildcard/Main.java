package _06_generics._07_wildcard;

public class Main {
    public static void main(String[] args) {
        var box = new NumberBox<>(123);
        var box1 = new NumberBox<>(123L);
        var box2 = new NumberBox<>(15.87);

    }
}
