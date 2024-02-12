/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4ques4;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab4ques4 {

    /**
     * @param args the command line arguments
     */
}
class student
{
    String student_name;
    int student_roll;
    int student_marks[] = new int[5];
    
    //Scanner sc = new Scanner(System.in);
    student(String student_name,int student_roll,int []arr)
    {
        this.student_name = student_name;
        this.student_roll = student_roll;
        for(int i=0;i<5;i++)
        {
            student_marks[i] = arr[i];
        }
    }
    void display(int []arr)
    {
        System.out.println("The name of the student is : "+student_name);
        System.out.println("The Roll no. of the student is : "+student_roll);
        int sum = 0;
        for(int i=0;i<5;i++)
        {
            sum = sum + arr[i];
        }
        
        int c = (sum/5);
        System.out.println("Average of marks in five subjects is : "+c);
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
        s1.display(marks);
        
        System.out.println("Enter name : ");
        String name1 = sc.next();
        System.out.println("Enter roll : ");
        int roll1 = sc.nextInt();
        System.out.println("Enter marks : ");
        int []marks1 = new int[5];
       for(int i=0;i<5;i++)
       {
           marks1[i] = sc.nextInt();
       }
       
        student s2 = new student(name1,roll1,marks1);
         s2.display(marks1);
        System.out.println("Enter name : ");
        String name2 = sc.next();
        System.out.println("Enter roll : ");
        int roll2 = sc.nextInt();
        System.out.println("Enter marks : ");
        int []marks2 = new int[5];
       for(int i=0;i<5;i++)
       {
           marks2[i] = sc.nextInt();
       }
       
        student s3 = new student(name2,roll2,marks2);
        s3.display(marks2);
    }
}
    

