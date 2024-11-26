package _09_stream._03_intermediate;

import java.util.Comparator;

public class WildAgeCatComparator implements Comparator<WildCat> {
    @Override
    public int compare(WildCat wildCat1, WildCat wildCat2) {
        return wildCat1.getAge() -wildCat2.getAge();
    }
}
