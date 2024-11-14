package _07_collection._05_map;

import _07_collection._04_set.Fish;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Fish> map = new HashMap<>();
        //удалить все пары ключ-значение
        map.clear();
        //добавить в мапу
        map.put("One", new Fish("Пенка", 1));
        map.put("Two", new Fish("Солнышко", 2));
        //Извлечь по ключу
        System.out.println(map.get("Пенка"));
        System.out.println(map.getOrDefault("Коралл", new Fish("Fake", 3)));
        //проверка наличия ключа в мапе
        System.out.println(map.containsKey("Five"));
        //Проверка наличия значения
        System.out.println(map.containsValue(new Fish("Пенка", 1)));
        //Получить список ключей
        System.out.println(map.keySet());
        //Получить множество значений
        System.out.println(map.values());
        //Список вхождений
        System.out.println(map.entrySet());
        //Проверка на пустоту
        System.out.println(map.isEmpty());
        //Колличество вхождений
        System.out.println(map.size());
        //Добавить другую мапу
        map.putAll( Map.of("Three", new Fish("Волна", 1),
                "Five", new Fish("Ветерак", 3) ));
        map.remove("Three");

        //Порядок определяется hash
        System.out.println(map);
        System.out.println("One".hashCode() & 15);
        System.out.println("Five".hashCode() & 15);
        System.out.println("Two".hashCode() & 15);

        //Порядок определяется сортировкой по ключам
        Map<String, Fish> map1 = new TreeMap<>();
        map1.put("One", new Fish("Пенка", 1));
        map1.put("Two", new Fish("Солнышко", 2));
        map1.put("Three", new Fish("Волна", 2));
        map1.put("Five", new Fish("Ветерак", 2));
        System.out.println(map1);

        //Порядок хранения определяется порядком вставки
        Map<String, Fish> map2 = new LinkedHashMap<>();
        map2.put("One", new Fish("Пенка", 1));
        map2.put("Two", new Fish("Солнышко", 2));
        map2.put("Three", new Fish("Волна", 2));
        map2.put("Five", new Fish("Ветерак", 2));
        System.out.println(map2);
    }
}
