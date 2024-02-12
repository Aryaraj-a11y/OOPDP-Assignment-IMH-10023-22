/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5ques2;

/**
 *
 * @author 91778
 */
public class Lab5ques2 {

    /**
     * @param args the command line arguments
     */
}
class Bird
{
    void fly()
    {
        System.out.println("Bird is flying");
    }
}
class parrot extends Bird
{
    void showcolor()
    {
        System.out.println("The colour of the parrot is green ");
    }
}
class crow extends Bird
{
    void showcolor()
    {
        System.out.println("The colour of the crow is black ");   
    }
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        parrot p = new parrot();
        crow c = new crow();
        p.showcolor();
        p.fly();
        c.showcolor();
        c.fly();
    }
    
}
