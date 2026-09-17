import java.util.*;

public class Week6_TASK3_TwoString {

    public static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            set.add(ch);
        }

        for (char ch : s2.toCharArray()) {
            if (set.contains(ch)) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("Result: " + twoStrings(s1, s2));

        sc.close();
    }
}