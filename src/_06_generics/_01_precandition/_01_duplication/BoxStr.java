package _06_generics._01_precandition._01_duplication;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoxStr {
    private String value;

    public String doSmth() {
        return  value;
    }
}
