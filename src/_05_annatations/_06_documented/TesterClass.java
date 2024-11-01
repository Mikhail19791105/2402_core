package _05_annatations._06_documented;

public class TesterClass {
    @TestDocumented(doTest = "Hello doc with annotation")
    public void doSomeDocumented(){
        System.out.println("test for annotation with '@Documented'");
    }
    @TestNotDocumented(doTestNo = "Hello doc without annotation")
    public void doSomeNotDocumented(){
        System.out.println("Test for annotation without'@Documented'");
    }
}
