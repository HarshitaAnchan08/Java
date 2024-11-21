//Reverse the array

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        //Taking the array length from user
        System.out.print("Enter length of array : ");
        int len=s.nextInt();
        
        //Define an array
        int[] org_array=new int[len];
        
        //Taking input into orginal array
        System.out.println("Enter "+len+" elements : ");
        for(int i=0;i<len;i++){
            org_array[i]=s.nextInt();
        }
        
        System.out.print("Orginal array : ");
        for(int i: org_array){
            System.out.print(i+" ");
        }
        
        System.out.print("\nThe elements in reverse order are : ");
        for(int i=len-1;i>=0;i--){
            System.out.print(org_array[i]+" ");
        }
        
        
        
        
    }
}
