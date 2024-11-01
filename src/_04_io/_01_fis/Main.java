package _04_io._01_fis;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String TEXT_EXT = "src/_04_io/_01_fis/test.ext";
    public static final String TEXT_1_EXT = "src/_04_io/_01_fis/test1.ext";

    @SneakyThrows
    public static void main(String[] args) {
        try (var fos = new FileOutputStream("TEXT_EXT" );
             var fis = new FileInputStream("TEXT_EXT");
            var fos1 = new FileOutputStream("TEXT_1_EXT")){
            var outByteArray = "Hello world!!!".getBytes();
//            fos.write(outByteArray);
//
//            byte[] bytes = fis.readAllBytes();
//            System.out.println(new String(bytes));
//            fos1.write(bytes);
            for (byte b : outByteArray) {
                System.out.print((char) b);
            }
        }
    }
}
