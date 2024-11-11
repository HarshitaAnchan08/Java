//import Scanner class from util package
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size : ");
        int size=s.nextInt();
        
        int[] num=new int[size];
        System.out.print("Enter "+size+" elements : ");
        for(int i=0;i<num.length;i++){
            num[i]=s.nextInt();
        }
        int start=0;
        int end=num.length-1;
        
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
       System.out.println("Reversed elements are : ");
       for(int i=0;i<num.length;i++ ){
        System.out.println(num[i]);}
           
        }
    }
