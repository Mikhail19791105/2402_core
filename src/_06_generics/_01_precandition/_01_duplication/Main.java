package _06_generics._01_precandition._01_duplication;

public class Main {
    public static void main(String[] args) {
//        var boxInt = new BoxInt(123);
//        var boxStr = new BoxStr("456");
//
//        Integer valueInt = boxInt.doSmth();
//        String valueStr = boxStr.doSmth();

        var boxInt = new BoxObj(123);
        var boxStr = new BoxObj("456");

        Integer valueInt = (Integer) boxInt.doSmth();
        String valueStr = (String) boxStr.doSmth();
    }
}
