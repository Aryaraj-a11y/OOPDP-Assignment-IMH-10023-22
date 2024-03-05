/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7ques2;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Lab7ques2 {

    /**
     * @param args the command line arguments
     */
}
class Circle
{
    double area;
    double r;
    double area()
    {
        return 3.14*r*r;
    }
    void set_width()
    {
        
    }
    void perimeter()
    {
        System.out.println("The perimeter of the circle is "+2*3.14*r);
    }
    void circumference()
    {
         System.out.println("The circumference of the circle is "+2*3.14*r);
    }
}
class Cylinder extends Circle
{
    double height;
    void volume(double radius)
    {
        double X = 3.14*radius*radius;
        System.out.println("The volume of the cylinder is "+X*height);
    }
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        double radius = sc.nextDouble();
        Circle c = new Circle();
        c.r = radius;
        c.perimeter();
        c.circumference();
        System.out.println("The area of the circle is "+c.area());
        System.out.println("Enter the height of cylinder ");
        double height = sc.nextDouble();
        Cylinder c1 = new Cylinder();
        c1.height = height;
        c1.volume(radius);
    }
    
}
