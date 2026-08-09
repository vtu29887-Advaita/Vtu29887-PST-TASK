package Week3;
import java.util.*;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                sc.close();
                return;
            }

            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                if (!sc.hasNextInt()) {
                    sc.close();
                    return;
                }
                row.add(sc.nextInt());
            }

            list.add(row);
        }

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            if (!sc.hasNextInt()) {
                break;
            }
            int x = sc.nextInt();

            if (!sc.hasNextInt()) {
                break;
            }
            int y = sc.nextInt();

            if (x >= 1 && x <= list.size()
                    && y >= 1 && y <= list.get(x - 1).size()) {

                System.out.println(list.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}