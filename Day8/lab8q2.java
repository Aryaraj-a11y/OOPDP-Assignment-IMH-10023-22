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
public class lab8q2 {
    
     public static void main(String []args)
    {
        Bike B = new Honda();
        B.run();
    }
}
abstract class Bike
{
    void run()
    {
       System.out.println("In method run ");
    }
}
 class Honda extends Bike
{
     void run()
    {
       System.out.println("In method run ");
    }
}
    class main
    {
  public static void main(String []args)
    {
        Bike B = new Honda();
        B.run();
    }
    }
    
   

