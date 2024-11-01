package _07_collection._01_ierarchi;

import _04_io._04_ps.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var cats = new ArrayList<>(List.of (
                new CollectionCat("Vaska", 10),
                new CollectionCat("Vaska", 5),
                new CollectionCat("Vaska", 7),
                new CollectionCat("Vaska", 1)
                        ));

                cats.removeIf(cat -> cat.getAge()>=5);
                cats.forEach(System.out::println);
    }
}
