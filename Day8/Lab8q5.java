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
public class Lab8q5 {
    
}
class Base1
{
    abstract class Base2
    {
        void display()
        {
            System.out.println("In display method ");
        }
    }
}
class Derived1 extends Base1
{
    class Derived2 extends Base2
    {
        void display()
        {
             System.out.println("In display method ");
        }
    }
}

class Mai
{
    public static void main(String[]args)
    {
         Scanner sc = new Scanner(System.in);
        Base1.Base2 obj = new Derived1().new Derived2();
        obj.display();
    }
}
