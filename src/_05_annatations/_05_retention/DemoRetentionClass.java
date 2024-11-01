package _05_annatations._05_retention;

import lombok.AllArgsConstructor;

@RetentionAnnotation
@Deprecated(forRemoval = true)
@AllArgsConstructor
public class DemoRetentionClass {
}
