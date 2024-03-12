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
public class Lab8q1 {
    
}
class outer1
{
    class Inner1
    {
        void display()
        {
              System.out.println("Inside display inner ");
        }
    }
}
class outer
{
    void displayouter()
    {
        System.out.println("In outer display");
        class Inner
        {
            void displayInner()
            {
                 System.out.println("In Inner method");
            }
        }
        Inner in = new Inner();
        in.displayInner();
    }
}
class outer2
{
static class Inner
{
    public static void displayInner()
    {
        System.out.println("In Inner method");
    }
}
}
class Main
{
    public static void main(String []args){
        outer1.Inner1 in1 = new outer1().new Inner1();
        in1.display();
        
        outer out = new outer();
        out.displayouter();
        
        outer2.Inner.displayInner();
        
    }
}
