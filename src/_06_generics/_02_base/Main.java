package _06_generics._02_base;

public class Main {
    public static void main(String[] args) {
        var boxInt = new GenericsBox<Integer>(123);
        var boxStr = new GenericsBox<String>("456");

        Integer valueInt = boxInt.doSmth();
        String valueStr = boxStr.doSmth();

    }
}
