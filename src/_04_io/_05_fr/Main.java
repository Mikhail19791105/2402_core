package _04_io._05_fr;

import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static final String FILE = "src/_04_io/_05_fr/file.file";
    @SneakyThrows
    public static void main(String[] args) {
        try (var fw = new FileWriter(FILE, true);
            var fr = new FileReader(FILE)){
            fw.write("Hello people...");
           // fw.flush();
            fw.append('\n');
            fw.append("and animals..");

        }
    }
}
