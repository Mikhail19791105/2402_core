package _08_lambdas._03_var_usage;

public class MainMethod {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        Operable operable = () -> {
           // x = 30;
            return x + y;
        };
        System.out.println(operable.operate());
    }
}
