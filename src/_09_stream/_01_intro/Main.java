package _09_stream._01_intro;

import javax.sql.PooledConnection;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    private static final Predicate<Number> POSITIVE = number -> number.intValue() >= 0;
    private static final Predicate<Number> NEGATIVE = number -> number.intValue() < 0;
    public static void main(String[] args) {
        List <Number> numbers = List.of(-5, -4, -3.5, -1.25, 0 , 2, 6, 5, -5);
        System.out.println(calculatePositive(numbers));
        System.out.println(numbers.stream()
                .filter(POSITIVE)
                .count());
        System.out.println(numbers);

        //нельзя произвести действия над стримом  после терминальной операции
//        var stream = numbers.stream();
//        stream.filter(POSITIVE).count();
//        stream.count();

        //Нельзя вызвать обработку стрима на одном и том же состоянии
        var str = numbers.stream();
       // str.filter(POSITIVE);
       // str.count();

        var str1 = numbers.stream().filter(NEGATIVE);
        System.out.println(str1.count());
    }
    private static int calculatePositive(List<Number> numbers) {
        var count = 0;
        for (Number number : numbers) {
            if (number.intValue() >= 0) {
                count++;
            }
        }
       return count;
    }
}
