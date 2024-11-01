package _06_generics._02_base;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GenericsBox<T> {
    private T value;

    public T doSmth() {
        return value;
    }
}
