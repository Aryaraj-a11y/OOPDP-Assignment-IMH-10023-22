/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7ques6;

/**
 *
 * @author acer
 */
import java.util.*;
public class Lab7ques6 {

    /**
     * @param args the command line arguments
     */
}
class person
{
    String name;
    int age;
    void display(int x,int y)
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class student extends person
{
    int roll;
    int marks;
     void display(int a,int b)
    {
        super.display(20, 30);
        marks = a;
        roll = b;
        System.out.println("Roll : "+roll);
        System.out.println("marks : "+marks);
    }
}
class Employee extends person
{
    double salary;
    void display(int p,int q)
    {
        super.display(20,30);
        salary = p;
        System.out.println("Salary : "+salary);
    }
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        person obj1 = new student();
        System.out.println("Enter student name ");
        obj1.name=sc.next();
        System.out.println("Enter Age ");
        obj1.age=sc.nextInt();
        System.out.println("Enter marks ");
        int a = sc.nextInt();
        System.out.println("Enter Roll ");
        int b = sc.nextInt();
        obj1.display(a, b);
        
        person obj2 = new Employee();
        System.out.println("Enter Employee name ");
        obj2.name=sc.next();
        System.out.println("Enter Age ");
        obj2.age=sc.nextInt();
        System.out.println("Enter salary ");
        int p = sc.nextInt();
        obj2.display(p,30);
    }
    
}
