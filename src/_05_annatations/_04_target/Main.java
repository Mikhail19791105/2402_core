package _05_annatations._04_target;

import lombok.SneakyThrows;

import java.lang.reflect.AnnotatedElement;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        var demoClass = DemoTargetClass.class;
        readAnnotations(demoClass);
        var demoClassMethod = demoClass.getMethod("print");
        readAnnotations(demoClassMethod);
    }

    static void readAnnotations(AnnotatedElement element) {
        System.out.println("\nFind annotations in " + element.getClass().getName());
        var annotation = element.getAnnotation(JavaFilreInfo.class);
        System.out.println("Author: " + annotation.name());
        System.out.println("Version: " + annotation.value());
    }
}
