package week5;
import java.util.Scanner;
public class Week5_TASK7_LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256];

        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (lastIndex[ch] >= left) {
                left = lastIndex[ch] + 1;
            }

            lastIndex[ch] = right;

            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int result = lengthOfLongestSubstring(s);

        System.out.println("Length of longest substring without duplicate characters: " + result);

        sc.close();
    }
}
    
