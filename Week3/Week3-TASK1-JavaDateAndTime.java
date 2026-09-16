package Week3;

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month day year: ");
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        System.out.println(findDay(month, day, year));
        sc.close();
    }
}