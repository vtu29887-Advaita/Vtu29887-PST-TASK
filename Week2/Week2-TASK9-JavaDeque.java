package Week2;
import java.util.*;

public class JavaDeque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (i >= m) {
                map.put(arr[i - m], map.get(arr[i - m]) - 1);

                if (map.get(arr[i - m]) == 0) {
                    map.remove(arr[i - m]);
                }
            }

            if (i >= m - 1) {
                max = Math.max(max, map.size());
            }
        }

        System.out.println("Maximum distinct integers = " + max);

        sc.close();
    }
}