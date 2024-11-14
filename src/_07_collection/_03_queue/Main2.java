package _07_collection._03_queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {

        //Класс позволяет организовывать очередь с приоритетами основанными на компараторе
        // с естественным порядком сравнения
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("A");
        queue.offer("J");
        queue.offer("Q" );
        queue.offer("Z" );
        queue.offer("B");
        queue.offer("S");
        queue.offer("C");
        System.out.println(queue);
        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }

        //Но мы можем изменить порядок сортировки передав в конструктор другой компаратор
        // например Collections.reverseOrder()
        System.out.println();
        Queue<String> queue2 = new PriorityQueue<>(Collections.reverseOrder());
        queue2.offer("A");
        queue2.offer("J");
        queue2.offer("Q" );
        queue2.offer("Z" );
        queue2.offer("B");
        queue2.offer("S");
        queue2.offer("C");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }
    }
}
