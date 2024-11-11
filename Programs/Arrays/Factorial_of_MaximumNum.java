//Program to find factorial of maximum number in an array

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size : ");
        int size=s.nextInt();
        
        int[] arr=new int[size];
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Element : ");
            arr[i]=s.nextInt();
        }
        //Initialize max variable
        int max=arr[0];
       //maximum number
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //factorial of number
        int fact=1;
        for(int j=1;j<=max;j++){
            fact*=j;
        }
        //Print fact variable
        System.out.println("The factorial of maximum number is : "+fact);
    }
}


