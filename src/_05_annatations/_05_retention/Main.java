package _05_annatations._05_retention;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        var demoClass = DemoRetentionClass.class;
        var annotations = demoClass.getAnnotations();
        System.out.println("Annotations size " + annotations.length);
        for (Annotation ann : annotations) {
            System.out.println(ann);
        }
    }
}
