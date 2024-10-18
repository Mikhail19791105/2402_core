package _01_reflection;

public class TestReflection {
    private String someField;

    private void someMethod() {
        System.out.println("Hello!!!");
    }

    private void methodWithArgs(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "TestReflection{" +
                "someField='" + someField + '\'' +
                '}';
    }
}
