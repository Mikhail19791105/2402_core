package _04_io._02_bais;

import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
//        var bais = new ByteArrayInputStream("Hello world!!!".getBytes(), 0, 5);
//        var baos = new ByteArrayOutputStream();
//
//        baos.write(bais.readAllBytes());
//        System.out.println(baos);
//
//        bais.transferTo(baos);
//        baos.writeTo(new FileOutputStream());

        new ByteArrayInputStream("Hello world".getBytes(), 0, 5)
                .transferTo(new FileOutputStream("src/_04_io/_02_bais/test.ext"));

    }
  }

