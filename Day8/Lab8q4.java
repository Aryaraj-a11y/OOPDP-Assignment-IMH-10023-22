/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author acer
 */
import java.util.*;
public class Lab8q4 {
    
}
interface person
{
    int X=10;
    public static void method()
    {
         System.out.println("In Method ");
    }
   void method1();
   void method2();
}
class Employee implements person
{
     public void method1()
    {
        System.out.println("In Method 1 ");
    }
     public void method2()
     {
          System.out.println("In Method 2 ");
     }
}

class M
{
    public static void main(String []args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println(person.X);
         person.method();
         
         Employee E = new Employee();
         E.method1();
         E.method2();
    }
}
