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
        int[] nums={0,1,0,3,12};
        moveZeros(nums);
        system.out.println(Arrays.toString(nums));
    }
}
