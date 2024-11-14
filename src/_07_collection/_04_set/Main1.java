package _07_collection._04_set;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.add("zoom");
        navigableSet.add("apple");
        navigableSet.add("a");
        navigableSet.add("uncle");
        navigableSet.add("cat");
        navigableSet.add("bence");
        System.out.println(navigableSet);

        //Искать наименьший для элемент которого справедливо элемент >=obj
        System.out.println(navigableSet.ceiling("ab"));

        System.out.println("________________________");
        //Искать наибольший для элемент которого справедливо элемент >=obj
        System.out.println(navigableSet.floor("bf"));

        System.out.println("________________________");
        //Искать наибольший для элемент которого справедливо элемент >=obj
        System.out.println(navigableSet.higher("bz"));

        System.out.println("________________________");
        //Искать наименьший  элемент которого справедливо элемент >=obj
        System.out.println(navigableSet.higher("ежик"));

        System.out.println( navigableSet.subSet("bence", false, "uncle", true));
        System.out.println(navigableSet.subSet("bence", "uncle"));

        System.out.println("________________________");
        //возвращает первый элемент удаляя его
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet);

        System.out.println("________________________");
        //возвращает последний элемент удаляя его
        System.out.println(navigableSet.pollLast());
        System.out.println(navigableSet);

        System.out.println("________________________");
        //реверсируем коллекцию
        System.out.println(navigableSet.descendingSet());
    }
}
