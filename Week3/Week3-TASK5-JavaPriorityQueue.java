package Week3;
import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> {
            if (a.cgpa != b.cgpa)
                return Double.compare(b.cgpa, a.cgpa);
            if (!a.name.equals(b.name))
                return a.name.compareTo(b.name);
            return Integer.compare(a.id, b.id);
        });

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] s = line.split(" ");

            if (s[0].equals("ENTER")) {
                String name = s[1];
                double cgpa = Double.parseDouble(s[2]);
                int id = Integer.parseInt(s[3]);
                pq.offer(new Student(id, name, cgpa));
            } else {
                if (!pq.isEmpty())
                    pq.poll();
            }
        }

        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                System.out.println(pq.poll().name);
            }
        }

        sc.close();
    }
}