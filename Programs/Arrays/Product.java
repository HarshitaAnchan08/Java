//Program to find Product of all elements in an arrray

//import Scanner class from util package
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int product=1;
        //Taking size from user
        System.out.print("Enter size : ");
        int size=s.nextInt();
        
        //defining array
        int[] numbers=new int[size];
        
        //input from user
        for(int i=0;i<size;i++){
            System.out.print("Enter element : ");
            numbers[i]=s.nextInt();
        }
        
        //calculating sum
        for(int i=0;i<size;i++){
            product*=numbers[i];
        }
        
        //printing sum result
        System.out.print("The Product of all elements in a array is : "+product);
    }
}
