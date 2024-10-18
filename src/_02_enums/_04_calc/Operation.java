package _02_enums._04_calc;

public enum Operation {
    PLUS {public int operation(int x, int y) {return x + y;}},
    MINUS {public int operation(int x, int y) {return x - y;}};

    public abstract int operation(int x, int y);
}
