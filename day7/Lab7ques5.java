/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7ques5;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Lab7ques5 {

    /**
     * @param args the command line arguments
     */
}
class Base
{
    void display()
    {
        System.out.println("In display method 1 ");
    }
}
class Derived extends Base
{
    void display()
    {
         System.out.println("In display method 2 ");
    }
    void show()
    {
        System.out.println("In show method ");
    }
}
class Main
{
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Base b = new Base();
        b.display();
        Base b1 = new Derived();
        b1.display();
    }
    
}
