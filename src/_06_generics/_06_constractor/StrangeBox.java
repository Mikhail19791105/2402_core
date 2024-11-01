package _06_generics._06_constractor;

public class StrangeBox {
    private String value;

    public <T> StrangeBox(T value) {
        this.value = value.toString();
    }

    public String doSmth() {
        return value;
    }
}
