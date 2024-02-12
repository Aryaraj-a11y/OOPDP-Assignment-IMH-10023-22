/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4ques6;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab4ques6 {

    /**
     * @param args the command line arguments
     */
}
class area
{
    double length;
    double breadth;
    double side;
    
    //making a constructor static would deny the power of constructors for
    //accessing the instance variables . hence, in this case the instance 
    //variable i.e.length,breadth and side cannot be accessed by making 
    //constructor static and hence causing error
    static area(double...a)
    {
        if(a.length==2)
        {
         length = a[0];
         breadth = a[1];
        }
        else
        {
            side = a[0];
        }
 }
    area()
    {
        System.out.println("No arguments passed");
    }
    void Displayarea(double length,double breadth)
    {
        System.out.println("The length of the rectangle is : "+length);
        System.out.println("The breadth of the rectangle is : "+breadth);
        System.out.println("The area of the rectangle is : "+(length*breadth));
    }
    void Displayarea(double side)
    {
        System.out.println("The side of the square is : "+side);
        System.out.println("The area of the square is : "+(side*side));
    }
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square : ");
        double x = sc.nextDouble();
        System.out.println("Enter the length of a rectangle : ");
        double y = sc.nextDouble();
        System.out.println("Enter the breadth of a rectangle : ");
        double z = sc.nextDouble();
        
        area a1 = new area(y,z);
        a1.Displayarea(y,z);
        area a2 = new area(x);
        a1.Displayarea(x);
        
    }
}

    

