/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4ques3;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab4ques3 {

    /**
     * @param args the command line arguments
     */
}
class student
{
    String student_name;
    int student_roll;
    int []student_marks = new int[5];
    
    student(String student_name,int student_roll,int []array)
    {
        this.student_name = student_name;
        this.student_roll = student_roll;
         //if (array != null && array.length == 5) {
           // System.arraycopy(array, 0, this.student_marks, 0, 5);
           for(int i=0;i<5;i++)
           {
               student_marks[i] = array[i];
           }
    }
    student()
    {
        student_name = "Unknown";
        student_roll = 0;
       for(int i=0;i<5;i++)
       {
           student_marks[i] = 0;
       }
    }
    void Display()
    {
        System.out.println("The Name of student is : "+student_name );
        System.out.println("The Roll no. of student is : "+student_roll );
        System.out.println("The marks of student in five subjects are : ");
        for(int i=0;i<5;i++)
       {
           System.out.println(student_marks[i]);
       }
    }
    
    
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter roll : ");
        int roll = sc.nextInt();
        System.out.println("Enter marks : ");
        int []marks = new int[5];
       for(int i=0;i<5;i++)
       {
           marks[i] = sc.nextInt();
       }
       student s1 = new student(name,roll,marks);
       student s2 = new student();
       s1.Display();
       s2.Display();
    }
}  

