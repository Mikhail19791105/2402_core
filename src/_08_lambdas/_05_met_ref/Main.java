package _08_lambdas._05_met_ref;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
   static Consumer<String> consumer = str -> System.out.println(str);
   static Consumer<String> consumerMR = System.out::println;

    public static void main(String[] args) {
        consumerMR.accept("Hello");
        //Ссылка на статичесский метод
        Function<String, Boolean> functionBad = str -> Boolean.valueOf(str);
        Function<String, Boolean> function =  Boolean::valueOf;
        System.out.println(function.apply("true"));

        System.out.println("______________________________________");
        //Ссылка на не статичесский метод конкретного объекта
        Integer integer = 5;
        Supplier<String> supplierBad = () -> integer.toString();
        Supplier<String> supplier = integer::toString;
        System.out.println(supplier.get());

        System.out.println("______________________________________");
        //Ссылка на не статичесский метод любого объекта конкретного типа
        Function<String, String> toLowerBad = str -> str.toLowerCase();
        Function<String, String> toLower = String::toLowerCase;
        System.out.println(toLower.apply("JAVA"));

        System.out.println("______________________________________");
        //Ссылка на конструктор
        Function<String, String> strToIntBad = str -> new String(str);
        Function<String, String> strToStr = String::new;
        System.out.println(strToStr.apply("world"));
    }
}
