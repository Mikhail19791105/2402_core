package _07_collection._03_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main1 {
    public static void main(String[] args) {

        Deque<String> deque = new  ArrayDeque<>();
        //добавление в голову очереди
       deque.push("First");
       deque.addFirst("Second");
       deque.offerFirst("Third");
        System.out.println(deque);

        //Извлечение первого элемента из головы не удоляя
        System.out.println(deque.getFirst());

    }
}
