package _09_stream._03_intermediate;

import java.util.Comparator;

public class WildCatGenderComparator implements Comparator<WildCat> {
    @Override
    public int compare(WildCat wildCat1, WildCat wildCat2) {
        return wildCat1.getGender().compareTo(wildCat2.getGender());
    }
}
