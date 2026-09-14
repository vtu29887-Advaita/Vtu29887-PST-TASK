package week5;

import java.util.*;

public class Week5_TASK9_StringMatching {

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {

                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        List<String> result = stringMatching(words);

        System.out.println("Strings that are substring of another word: " + result);

        sc.close();
    }
}
