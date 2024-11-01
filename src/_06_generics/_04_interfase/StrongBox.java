package _06_generics._04_interfase;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StrongBox implements Wrappable<String> {
    private String value;

    @Override
    public String doSmth() {
        return value;
    }

}
