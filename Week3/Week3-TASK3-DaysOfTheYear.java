package Week3;
import java.time.LocalDate;

public class Task3 {
    public static int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-12"));
        System.out.println(dayOfYear("2019-02-15"));
        System.out.println(dayOfYear("2003-03-24"));
        System.out.println(dayOfYear("2004-03-30"));
    }
}