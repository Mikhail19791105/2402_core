package _04_io._03_bis;

import lombok.SneakyThrows;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Main {
    public static final String IN_EXT = "src/_04_io/_03_bis/in.ext";
    public static final String OUT_EXT = "src/_04_io/_03_bis/out.ext";

    @SneakyThrows
    public static void main(String[] args) {


       try (var bis = new BufferedInputStream((new FileInputStream("IN_EXT")));
            var bus = new BufferedOutputStream(new FileOutputStream(OUT_EXT ))){

       }
    }
}
