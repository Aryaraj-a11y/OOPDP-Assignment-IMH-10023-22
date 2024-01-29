/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3ques6;

/**
 *
 * @author 91778
 */
public class Lab3ques6{

    /**
     * @param args the command line arguments
     */
    void Display(int n)
    {
        System.out.println("int a = "+n);
    }
     void Display(int n,int r)
    {
        System.out.println("int a = "+n);
        System.out.println("int b = "+r);
    }
      void Display(Object o)
    {
        System.out.println("Object o = "+o);
    }
      void Display()
    {
        System.out.println("No parameters");
    }
      
    public static void main(String[] args) {
        // TODO code application logic here
        Lab3ques6 obj = new Lab3ques6();
        obj.Display(16);
        obj.Display(87,12);
        obj.Display('c');
        obj.Display("Arya");
         obj.Display();
    }
    
}
