//Maximum subarray

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int max_sum=nums[0];
        
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
         System.out.println("The maximum subarray is : "+max_sum);
    }
}
