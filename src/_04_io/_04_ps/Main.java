package _04_io._04_ps;

import lombok.SneakyThrows;

import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        try (var ps = new PrintStream("src/_04_io/_04_ps/out.txt");
            var oos = new ObjectOutputStream(ps)){
            //ps.printf("I am a cat, My name is %s, My age is %d.", "Murzik", 5);
            oos.writeObject(new Cat("Vaska", 3));
        }
    }
}
