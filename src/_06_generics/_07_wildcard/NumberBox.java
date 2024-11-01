package _06_generics._07_wildcard;


import lombok.AllArgsConstructor;

//Ограничение сверху
@AllArgsConstructor
public class NumberBox<T extends Number> {
    private T number;
}


