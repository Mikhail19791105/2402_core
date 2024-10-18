package _03_exception._03_own;

import lombok.Getter;

public class FactorialException extends Exception {
    @Getter
    private int number;

    public FactorialException(String massage, int number) {
        super(massage);
        this.number = number;
    }
}
