package _01_base;

public class DeyOfWeekBloch {
    private String title;

    private DeyOfWeekBloch(String title) {
        this.title = title;
    }

    public static DeyOfWeekBloch TUESDAY = new DeyOfWeekBloch("Tuesdey");

    public static DeyOfWeekBloch SUNDAY = new DeyOfWeekBloch("Sunday");
}
