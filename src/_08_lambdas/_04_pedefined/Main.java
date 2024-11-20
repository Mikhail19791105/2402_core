package _08_lambdas._04_pedefined;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static Predicate<Duck> howMoney = duck -> duck.getMoney() > 2_500_000_000L;
    static Predicate<Duck> howGC = duck -> duck.getGrandChild() < 3;

    static Consumer<Duck> printUpper = duck -> System.out.println(duck.getName().toUpperCase());
    static Consumer<Duck> printMoney = duck -> System.out.println(duck.getMoney());

    static Function<Duck, String> convertToString = duck -> duck.getName();
    static Function<String, Integer> convertToInt = name -> name.length();

    static Supplier<Duck> returnDuck = () -> new Duck("Scrooge", 2_525_632_125L, 3);

    public static void main(String[] args) {
        List<Duck> list = new ArrayList<>();
        var scrooge = new Duck("Scrooge", 2_525_632_125L, 3);
        System.out.println(howMoney.test(scrooge));
        System.out.println(howMoney.and(howGC).test(scrooge));
        System.out.println(howMoney.or(howGC).test(scrooge));
        System.out.println(howMoney.negate().test(scrooge));
        list.add(scrooge);
        list.stream().filter(duck -> duck.getMoney() > 2_500_000_000L);
        System.out.println("____________________________________");

        printUpper.accept(scrooge);
        printUpper.andThen(printMoney).accept(scrooge);

        System.out.println("____________________________________");
        System.out.println(convertToString.apply(scrooge));
        System.out.println(convertToString.andThen(convertToInt).apply(scrooge));

        System.out.println("____________________________________");
        System.out.println(returnDuck.get());
    }
}
