package Week4;
import java.util.*;
public class Task6 {
    public static void movezeros(int[]nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
    public static void main(string[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
    int[]nums=new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
    movezeros(nums);
    for(int i=0;i<n;i++){
            System.out.print("output: "+ Arrays.toString(nums));
            sc.close()

    ]
]
