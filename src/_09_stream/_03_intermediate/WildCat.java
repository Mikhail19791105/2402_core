package _09_stream._03_intermediate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class WildCat implements Comparable<WildCat>{
    private String name;
    private String gender;
    private int age;

    @Override
    public int compareTo(WildCat wildCat) {
        return name.compareTo(wildCat.getName());
    }
}
