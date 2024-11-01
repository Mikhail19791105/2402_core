package _04_io._07_file;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileWriter;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        var dir = new File("src/_04_io/_07_file/new_dir");
        dir.mkdir();
        var file = new File("src/_04_io/_07_file/new_dir/new file.txt");
        file.createNewFile();
        var fw = new FileWriter("src/_04_io/_07_file/new_dir/new file.txt");
        fw.write("Hello world!!!");
        fw.flush();
        System.out.println( file.length());
       ;
        file.renameTo(new File("src/_04_io/_07_file/new_dir/new file.txt"));
    }
}
