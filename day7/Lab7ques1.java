/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7ques1;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Lab7ques1 {

    /**
     * @param args the command line arguments
     */
}
class shape
{
    //double area;
    double getarea()
    {
        return -1;
    }
}
class Rectangle extends shape
{
    double length;
    double width;
    double getarea(double l,double w)
    {
        return l*w;
    }
}
class Box extends Rectangle
{
    double height;
    double getarea(double l,double w,double h)
    {
        return (2*l*w)+(2*l*h)+(2*h*w);
    }
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        shape s = new shape();
        System.out.println("The area of the shape is "+s.getarea());
        System.out.println("Enter length of rectangle ");
        double length = sc.nextDouble();
        System.out.println("Enter width of rectangle ");
        double width = sc.nextDouble();
        Rectangle R = new Rectangle();
       System.out.println("The area of the rectangler is "+R.getarea(length,width));
        
       System.out.println("Enter length of Box ");
        double length1 = sc.nextDouble();
        System.out.println("Enter width of Box ");
        double width1 = sc.nextDouble();
        System.out.println("Enter height of Box ");
        double height1 = sc.nextDouble();
        Box B = new Box();
        System.out.println("The area of the box is "+B.getarea(length1,width1,height1));
    }
}
