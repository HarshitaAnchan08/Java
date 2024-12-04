//Program to demostrate the use of array of objects

//define class Student
class Student{
    int rollno;
    String name;
    double marks;
}

class Main {
    public static void main(String[] args) {
        //creating object s1
        Student s1=new Student();
        s1.rollno=1;
        s1.name="Adarsh";
        s1.marks=90;
        
        //creating object s2
        Student s2=new Student();
        s2.rollno=2;
        s2.name="Bijoy";
        s2.marks=70;
        
        //creating object s3
        Student s3=new Student();
        s3.rollno=3;
        s3.name="Ceshav";
        s3.marks=80;
        
        //define array to store objects
        Student arr[]=new Student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        
        //print statement
        System.out.println("---Student Data---");
        
        //displaying name and marks of students
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].name+ " : "+arr[i].marks);
        }
    }
}
