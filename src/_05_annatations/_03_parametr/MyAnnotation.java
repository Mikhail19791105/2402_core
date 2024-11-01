package _05_annatations._03_parametr;


import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
@Documented

public @interface MyAnnotation {

    String name() default "";
    int value();
}
