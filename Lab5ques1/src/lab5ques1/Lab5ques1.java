/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5ques1;

/**
 *
 * @author 91778
 */
public class Lab5ques1 {

    /**
     * @param args the command line arguments
     */
}
class parent
{
    void showparent()
    {
        System.out.println("In show parent");
    }
}
class Child extends parent
{
    void showchild()
    {
        System.out.println("In show child");
    }
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Child c = new Child();
        c.showchild();
        c.showparent();
    }
    
}
