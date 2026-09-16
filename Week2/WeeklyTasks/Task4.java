package Week2.WeeklyTasks;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(18, 5, 2, 9);

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Square of " + number + " is " + (number * number));
            }
        }
    }
}