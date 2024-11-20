package _08_lambdas._03_var_usage;

public class MainClass {
    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
       Operable operable = () -> {
           x = 30;
           return  x + y;
       };
        System.out.println(operable.operate());
    }
}
