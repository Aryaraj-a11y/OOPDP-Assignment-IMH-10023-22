/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6ques4;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab6ques4 {

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
    public Object passobject(Object O)
    {
        return this;
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
        System.out.println(s1.passobject(s1));
        student s2 = new student();
        System.out.println(s2.passobject(s2));
        
    }
    
}

