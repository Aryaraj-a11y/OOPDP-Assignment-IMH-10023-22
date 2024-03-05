/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7ques4;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Lab7ques4 {

    /**
     * @param args the command line arguments
     */
}
class Rectangle
{
    double length;
    double breadth;
    
    Rectangle()
    {
        this.length = 1;
        this.breadth = 1;
    }
    Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
}
class cuboid extends Rectangle
{
    double height;
    cuboid()
    {
       //this.height = 1;
        super();
    }
    cuboid(double length,double breadth,double height)
    {
         super(10,20);
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    double volume()
    {
        return length*breadth*height;
    }
}

class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth ");
        double b = sc.nextDouble();
        System.out.println("Enter the height");
        double h = sc.nextDouble();
        cuboid c = new cuboid();
        c.volume();
        cuboid c1 = new cuboid(l,b,h);
        System.out.println("The volume of the cylinder is "+c1.volume());
    }
    
}

