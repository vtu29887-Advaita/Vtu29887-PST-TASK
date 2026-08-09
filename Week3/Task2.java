package Week3;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task2 {
    public static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int)Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    public static void main(String[] args) {
        System.out.println(daysBetweenDates("2007-01-24", "2026-08-10"));
        System.out.println(daysBetweenDates("2014-09-17", "2026-08-10"));
    }
}

