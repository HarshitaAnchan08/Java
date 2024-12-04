//Program to find the addition of two matrix or 2D arrays

import java.util.*;

class Main {
    public static void main(String[] args) {
        //scanner class
        Scanner s =new Scanner(System.in);
        
        #define arrays
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int sum[][]=new int[3][3];
        
        //taking input for matrix 1
        System.out.println("For matrix 1 : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter for element ("+i+","+j+ ") : ");
                arr1[i][j]=s.nextInt();
            }
        }
        
        //taking input for matrix 2
        System.out.println("\nFor matrix 2: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter for element ("+i+","+j+") : ");
                arr2[i][j]=s.nextInt();
            }
        }
        
        //displaying matrix 1
        System.out.println("Printing matrix 1 : \n");
        for(int n[]: arr1){
            for(int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        
        //displaying matrix 2
        System.out.println("Printing matrix 2 : \n");
        for(int n[]:arr2){
            for(int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        
        //calculating sum and displaying sum of two matrix
        System.out.print("\nThe Sum of both matrices are : \n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
