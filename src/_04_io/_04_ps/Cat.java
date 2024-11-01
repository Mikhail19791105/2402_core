package _04_io._04_ps;


import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Cat implements Serializable {
    String name;
    int age;

}
