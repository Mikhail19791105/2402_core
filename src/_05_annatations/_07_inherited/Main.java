package _05_annatations._07_inherited;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var parentAnnotations = Parent.class.getAnnotations();
        var childtAnnotations = Child.class.getAnnotations();
        System.out.println("Parent annotations size = " + parentAnnotations.length);
        for (Annotation annotation : parentAnnotations) {
            System.out.println(annotation);
        }
        System.out.println("Child annotations size = " + childtAnnotations.length);
        Arrays.stream(childtAnnotations).forEach(System.out::println);
    }
}
