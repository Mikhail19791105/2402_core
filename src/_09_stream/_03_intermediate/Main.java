package _09_stream._03_intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var wildCats = List.of(
                new WildCat("Marusia", "f", 2),
                new WildCat("Murzik", "m", 5),
                //new WildCat("Murzik", "m", 5),
                new WildCat("Zlodey", "m", 3),
                new WildCat("Zoya", "f", 10),
               // new WildCat("Zoya", "f", 10),
                new WildCat("Maria", "f", 50),
                new WildCat("Valera", "m", 35)
        );
        //Filter - ромежуточная операция принимает на вход предикат, оставляет в стриме
        //только элементы соответствующие предикату
        wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .filter(it -> it.getName().length() > 4)
                .forEach(System.out::println);

        //промежуточная операция принимает на вход фанкшн, преобразовывает один тип в другой
        //в результате получается стрим из других элементов

        System.out.println(wildCats.stream()
                .filter(it -> it.getGender().equals("m"))
                .map(WildCat::getName)
                //.forEach(it -> System.out.println(it + ", ")); можно так
                .collect(Collectors.joining(", ")));

        var tests = List.of(
                new Test(List.of("t1", "t2")),
                new Test(List.of("t3", "t4"))
        );

        tests.stream()
                .flatMap(it -> it.getList().stream())
                        .forEach(it -> System.out.print(it + ", "));

        System.out.println();
        //Сортировка бывает 2-х типов : простая и с компоратором.
        wildCats.stream()
                .sorted()
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));

        //сортировка по возрасту
        System.out.println();
        wildCats.stream()
                .sorted(new WildAgeCatComparator())
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();

        //сортировка по полу
        wildCats.stream()
                .sorted(new WildCatGenderComparator())
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        //Сначала выводим отсортированные больше 10 лет
        //зате меньше
        var oldStream = wildCats.stream()
                .filter(it -> it.getAge() >= 10)
                .sorted(new WildAgeCatComparator());
        var youngStream = wildCats.stream()
                .filter(it -> it.getAge() < 10)
                .sorted(new WildAgeCatComparator());
        Stream.concat(oldStream, youngStream)
                .map(WildCat::getAge)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();

        //избавление от дубликатов

        wildCats.stream()
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
        wildCats.stream()
                .distinct()
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();

        //Пропуск и ограничение колличества
        wildCats.stream()
                .skip(3)
                .limit(2)
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));

        System.out.println();
        //Экзотичесский метод
        wildCats.stream()
                .sorted(new WildAgeCatComparator())
                .takeWhile(it -> it.getAge() < 50)
                .map(WildCat::getName)
                .forEach(it -> System.out.print(it + ", "));
        System.out.println();
    }
}
