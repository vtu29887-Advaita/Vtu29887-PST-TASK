package Week2.WeeklyTasks;
import java.util.Scanner;
interface Add{
    int calculate(int a,int b);
}
interface EvenCheck{
    boolean check(int n);
}
interface square{
    int calculate(int n);
}
interface StringCompare{
    String compare(String s1,String s2);
}
public class LamdaExpression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers" );
        int a = sc.nextInt();
        int b = sc.nextInt();
        Add addition = (x,y) -> x+y;
        System.out.println("sum =" + addition);
    }
}