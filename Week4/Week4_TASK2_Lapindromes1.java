import java.util.*;

public class Week4_TASK2_Lapindromes1 {

    public static boolean isLapindrome(String str) {
        int n = str.length();

        String left;
        String right;

        if (n % 2 == 0) {
            left = str.substring(0, n / 2);
            right = str.substring(n / 2);
        } else {
            left = str.substring(0, n / 2);
            right = str.substring(n / 2 + 1);
        }

        int[] countLeft = new int[26];
        int[] countRight = new int[26];

        for (char c : left.toCharArray()) {
            countLeft[c - 'a']++;
        }

        for (char c : right.toCharArray()) {
            countRight[c - 'a']++;
        }

        return Arrays.equals(countLeft, countRight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isLapindrome(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
