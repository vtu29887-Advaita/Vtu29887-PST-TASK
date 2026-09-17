import java.util.*;

public class Week6_TASK2_RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String middle = doubled.substring(1, doubled.length() - 1);

        return middle.contains(s);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.println("Repeated Substring Pattern: "
                + repeatedSubstringPattern(s));

        sc.close();
    }
}
