/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6ques1;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab6ques1 {

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
    void display()
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
        s1.display();
        
        System.out.println("Enter the name : ");
        String name1 = sc.next();
        System.out.println("Enter the roll : ");
        int roll1 = sc.nextInt();
        System.out.println("Enter the fee : ");
        int fee1 = sc.nextInt();
        
        student s2 = new student(name1,roll1,fee1);
        s2.display();
    }
    
}
