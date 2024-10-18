package _05_annatations._01_base;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Cat {
    @Getter
    private String name;
}
