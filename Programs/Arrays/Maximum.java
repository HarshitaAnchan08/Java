//Program to find maximum number in an array.

import java.util.*;
class Main{
    public static void main(String[] args) {
        //Scanner class
        Scanner s=new Scanner(System.in);
        
        int size;
        System.out.print("Enter size : ");
        size=s.nextInt();
        //Defining array
        int[] num=new int[size];
        
        //input
        for(int i=0;i<num.length;i++){
            System.out.print("Enter elements : ");
            num[i]=s.nextInt();
        }
        //consider first index has max number
        int max=num[0];
        
        for(int i=0;i<num.length;i++){
            if (num[i]>max){
                max=num[i];
            }
        }
        //Printing max result
        System.out.println("Maximum number is : "+max);
    }
}
