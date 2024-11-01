package _05_annatations._07_inherited;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited//плозволяет наследовать аннотации
public @interface InheritedAnnotation {
}
