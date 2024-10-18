package _02_enums._03_enchansed;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DayOfWeek.values()));

        System.out.println(DayOfWeek.FRIDAY.ordinal());

        System.out.println(DayOfWeek.valueOf("SUNDAY"));
    }
}
