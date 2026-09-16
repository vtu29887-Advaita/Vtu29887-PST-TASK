package Week3;
import java.time.LocalDate;

public class Task4 {
    public static String dayOfTheWeek(int day, int month, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(24, 1, 2007));
        System.out.println(dayOfTheWeek(17, 9, 2014));
        System.out.println(dayOfTheWeek(14, 3, 1986));
    }
}