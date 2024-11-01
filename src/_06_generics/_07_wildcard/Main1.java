package _06_generics._07_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    //если извлекаем то используем extends
    //если добавляем то используем super

    public static void main(String[] args) {
        var list = new ArrayList<String>();
        Test.print(list);
    }

    private static class Test {
        public static void print(List<? super String> list) {
            list.add("Hello");
            System.out.println(list.get(0));
        }
    }
}
