package week5;
import java.util.List;
import java.util.Scanner;
public class Task3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

    int t=sc.nextInt();
    while(t-->0){
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
int maxsub=a[0];
int sum=0;
int maxseq=0;
int maxElement = a[0];
for(int x:a){
    sum=Math.max(x,sum + x);
    maxsub = Math.max(maxsub,sum);
    if(x>0)
        maxseq+=x;
    maxElement=Math.max(maxElement,x);
}
if(maxseq == 0)
    maxseq = maxElement;
System.out.println(maxsub + " "+maxseq);
    }
    sc.close();
}
}  