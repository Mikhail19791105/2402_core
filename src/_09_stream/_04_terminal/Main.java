package _09_stream._04_terminal;

import _09_stream._03_intermediate.WildAgeCatComparator;
import _09_stream._03_intermediate.WildCat;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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

        //колличество элементов в стриме
        System.out.println(wildCats.stream().count());
        //извлечь первый элемент
        System.out.println(wildCats.stream().findFirst().get());
        //извлечь случайный элемент
        System.out.println(wildCats.stream().findAny().get());
        //все удовлетворяют условие
        System.out.println(wildCats.stream().allMatch(it ->
                it.getAge() > 5));
        //хотя бы один удовлетворяют условие
        System.out.println(wildCats.stream().anyMatch(it -> it.getAge() > 5));

        //ни один не удовлетворяют условие
        System.out.println(wildCats.stream().noneMatch(it -> it.getAge() < 2));

        //минимальный элемент
        System.out.println(wildCats.stream()
                .min(new WildAgeCatComparator()).get());
        //максимальный элемент
        System.out.println(wildCats.stream()
                .max(new WildAgeCatComparator()).get());

        //СведЕние
        System.out.println(wildCats.stream()
                .map(WildCat::getAge)
                .reduce((x, y) -> x + y).get());

        System.out.println(wildCats.stream()
                .map(WildCat::getAge)
                .reduce(1,(x, y) -> x + y));

        //Коллект
        var girls = wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .collect(Collectors.toList());
        System.out.println(girls);
        var girlsNew = wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .toList();

        System.out.println();
        var setGirls = wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .collect(Collectors.toSet());

        System.out.println();
        var mapGirls = wildCats.stream()
                .filter(it -> it.getGender().equals("f"))
                .collect(Collectors.toMap(k -> k.getName(), v -> v));
        System.out.println(mapGirls);

        var linkedGirls = wildCats.stream()
                .collect(Collectors.toCollection(LinkedList::new));

        //паралельный стрим
        var parallelCats = wildCats.stream()
                .map(WildCat::getName)
                .parallel()
                .sorted()
                .toList();
        System.out.println(parallelCats);

        System.out.println();
        var names = wildCats.stream()
                .map(WildCat::getName)
                .toList();
        System.out.println();
        var par = names.parallelStream().sorted().collect(Collectors.toList());
        System.out.println(par);
    }
}
