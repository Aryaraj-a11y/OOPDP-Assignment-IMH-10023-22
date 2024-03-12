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
import java.util.Scanner;
public class Lab8q3 {
    
    
}
abstract class Shape
{
   void perimeter()
   {
       
   }
   void area()
   {
       
   }
}
class circle extends Shape
{
    double radius;
    double area(double r)
   {
       return 3.14*r*r;
   }
    double perimeter(double r)
   {
       return 2*3.14*r;
   }
}
class Rectangle extends Shape
{
    double length;
    double breadth;
    double area(double l,double b)
   {
       return l*b;
   }
    double perimeter(double l,double b)
   {
       return 2*(l+b);
   }
}

class C
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Rectangle R = new Rectangle();
        System.out.println("Enter length ");
        double l = sc.nextDouble();
        System.out.println("Enter breadth ");
        double b = sc.nextDouble();
        System.out.println("The area of the rectangle is "+R.area(l,b));
        System.out.println("The perimeter of the rectangle is "+R.perimeter(l,b));
        
        circle c = new circle();
        System.out.println("Enter radius ");
        double r = sc.nextDouble();
        System.out.println("The perimeter of the circle is "+c.perimeter(r));
        System.out.println("The area of the circle is "+c.area(r));
    }
}
