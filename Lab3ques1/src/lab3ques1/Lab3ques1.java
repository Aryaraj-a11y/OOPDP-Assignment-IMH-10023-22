/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3ques1;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab3ques1 {

    /**
     * @param args the command line arguments
     */
    void area(double r)
    {
        System.out.println("Area of circle is "+3.14*r*r);
    }
    void area(double l,double b)
    {
        System.out.println("Area of rectangle is "+l*b);
    }
     void areaOfsquare(double s)
    {
        System.out.println("Area of square is "+s*s);
    }
     void perimeter(double r)
     {
         System.out.println("The perimeter of circle is "+2*3.14*r);
     }
    void perimeter(double l,double b)
     {
         System.out.println("The perimeter of rectangle is "+2*(l+b));
     }
     void perimeterOfsquare(double s)
     {
         System.out.println("The perimeter of square is "+4*s);
     }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Lab3ques1 obj = new Lab3ques1();
        obj.area(3);
        obj.area(4,6);
        obj.areaOfsquare(8);
        obj.perimeter(5);
        obj.perimeter(3,8);
        obj.perimeterOfsquare(7);
    }
    
}
