package _07_collection._01_ierarchi;

import _04_io._04_ps.Cat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        var cats = new ArrayList<>(List.of (
//                new CollectionCat("Vaska", 10),
//                new CollectionCat("Vaska", 5),
//                new CollectionCat("Vaska", 7),
//                new CollectionCat("Vaska", 1)
//                        ));
//
//                cats.removeIf(cat -> cat.getAge()>=5);
//                cats.forEach(System.out::println);
        Collection<String> coll = new ArrayList<>();

        //добавление элемента в коллекцию
        coll.add("First");
        coll.add("Seventh");

        //добавление  в коллекцию другую коллекцию
        coll.addAll(List.of("Second", "Third"));
        coll.forEach(System.out::println);

        //Проверка наличия в коллекции определенного объекта
        System.out.println(coll.contains("Second"));

        //Проверка наличия в коллекции нескольких объектов одновременно
        System.out.println(coll.containsAll(List.of("Second", "Fifth")));

        //Колличество элементов в коллекции
        coll.size();

        //роверка что коллекция пустая
        coll.isEmpty();
        boolean b = coll.size() == 0;

        //Проверка что коллекция не пустая
        b = coll.size() > 0;
        b = !coll.isEmpty();

        //даление одного объекта
        b = coll.remove("Sixth");
        System.out.println(b);

        System.out.println("_________________________________");
        //даление нескольки объектов
        b = coll.removeAll(List.of("Second", "Fifth"));
        System.out.println(b);
        coll.forEach(System.out::println);

        System.out.println("________________________________");
        //Удаление одного объекта по некоторому условию
        coll.removeIf(elem -> elem.length() == 5);
        coll.forEach(System.out::println);

        System.out.println("________________________________");
        //Оставить в коллекции только элементы содержащиеся в другой коллекции
        coll.retainAll(List.of("Second", "Fifth"));
        coll.forEach(System.out::println);

    }
}
