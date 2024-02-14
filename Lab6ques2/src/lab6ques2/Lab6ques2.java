/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6ques2;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab6ques2 {

    /**
     * @param args the command line arguments
     */
}
class student
{
    String student_name;
    int student_roll;
    int student_fee;
    
    student(String student_name,int student_roll,int student_fee)
    {
        this.student_name = student_name;
        this.student_roll = student_roll;
        this.student_fee = student_fee;
    }
    student()
    {
        this("XYZ",10,4452);
    }
    void show(Object O)
    {
        display(this);
    }
    void display(Object obj)
    {
        System.out.println("The name of the student is : "+this.student_name);
        System.out.println("The roll of the student is : "+this.student_roll);
        System.out.println("The fee of the student is : "+this.student_fee);
    }
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.next();
        System.out.println("Enter the roll : ");
        int roll = sc.nextInt();
        System.out.println("Enter the fee : ");
        int fee = sc.nextInt();
        
        student s1 = new student(name,roll,fee);
        s1.show(s1);
        student s2 = new student();
        s2.show(s2);
    }
    
}
