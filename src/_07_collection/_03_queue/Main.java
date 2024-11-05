package _07_collection._03_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        //добавление элемента в очередь
        queue.add("First");
        queue.offer("Second");
        queue.offer("Third");
        queue.offer("Forth");
        queue.offer("Fifth");
        System.out.println(queue);

        //Удаление элемента из головы очереди
        String element = queue.remove();
        System.out.println("Element: " + element);
        System.out.println(queue);

        //удаление элемента из любогоместа очереди (это метод из Collection)
        queue.remove("Forth");
        System.out.println(queue);

        System.out.println("________________________");
        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println("________________________");
        //Удаление элемента из головы очереди
        System.out.println(queue.poll());
        System.out.println(queue);

        queue.add(null);
        System.out.println(queue);
    }
}
