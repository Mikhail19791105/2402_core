package _05_annatations._01_base;

@FunctionalInterface
public interface MyInterface {
    void myMethod();

    default String secondMethod() {
        return "Hello world";
    }
}
