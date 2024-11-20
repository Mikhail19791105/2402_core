package _09_stream._02_create;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //пустой стрим
        var empty = Stream.empty();
        //Секим из коллекции
        var listStream = new ArrayList<>().stream();
        //Стрим из вхождений ьфпы
        var mapStream = new HashMap<>().entrySet().stream();
        //Стрим из массива
        var arrayStream = Arrays.stream(new int[]{1, 2});
        //Стрим из Элементов
        var someStream = Stream.of("1", "two", "three");
    }
}
