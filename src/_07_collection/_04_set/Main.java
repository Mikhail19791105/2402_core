package _07_collection._04_set;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>(Collections.reverseOrder());
        sortedSet.add(5);
        sortedSet.add(3);
        sortedSet.add(1);
        sortedSet.add(7);
        sortedSet.add(11);
        sortedSet.add(9);
        //вернуть компаратор с помощью которого производится сортировка
        //null - если естественный порядок сортировки
        System.out.println(sortedSet.comparator());

        //вернуть первый элемент отсортированного списка
        System.out.println(sortedSet.first());
        //вернуть оследний элемент отсортированного списка
        System.out.println(sortedSet.last());
        //вернуть тело списка
        //начало меньше либо равно конец строго меньше
        System.out.println(sortedSet.subSet(9, 3));

        //вернуть голову списка
        //конец не включая
        System.out.println(sortedSet.headSet(7));

        //вернуть хвост списка
        //конец меньше либо равно
        System.out.println(sortedSet.tailSet(7));
    }
}
