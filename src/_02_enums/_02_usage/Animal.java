package _02_enums._02_usage;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Animal {

    private String name;
    private int age;
    private Genus genus;

    public static void voice(Animal animal) {
        switch (animal.genus) {
            case CAT:
                System.out.println("Miau");
                break;
            case DOG:
                System.out.println("Gav");
                break;
            case HOBBYHORSER:
                System.out.println("Wif");
                break;
            default:
        }
    }
}
