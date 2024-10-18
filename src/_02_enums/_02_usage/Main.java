package _02_enums._02_usage;

import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) {
        var cat = new Animal("Murzik", 2, Genus.CAT);
        var dog = new Animal("Tuzik", 2, Genus.DOG);
        var vasia = new Animal("Vasia Pupkin", 25, Genus.HOBBYHORSER);

        Animal.voice(vasia);
        Animal.voice(dog);
    }
}
