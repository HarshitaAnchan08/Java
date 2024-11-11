//Program to find minimum number in an array.

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
        //consider first index has min number
        int min=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        
        //Printing min result
        System.out.println("Minimum number is : "+min);
    }
}
