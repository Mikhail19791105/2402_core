package _02_enums._03_enchansed;

import lombok.Getter;
import lombok.ToString;

@ToString
public enum DayOfWeek {

    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thurday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");

    @Getter
    private String title;

    DayOfWeek(String title) {
        this.title  = title;
    }
}
