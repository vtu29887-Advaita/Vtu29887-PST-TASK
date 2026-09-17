import java.util.Scanner;

public class Week4_TASK1_DetermineIfStringHalvesAreAlike {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int mid = s.length() / 2;
        int firstVowels = 0;
        int secondVowels = 0;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                firstVowels++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                secondVowels++;
            }
        }

        if (firstVowels == secondVowels) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}

