//Program to count number of elements in an array

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //int size;
        //System.out.print("Enter size : ");
        //size=s.nextInt();
        
        int[] num=new int[10];
        
        for(int i=0;i<num.length;i++){
            System.out.print("Enter element : ");
            num[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<num.length;i++){
            count+=1;
        }
        System.out.println("Number of elements in an array : "+count);
    }
}
