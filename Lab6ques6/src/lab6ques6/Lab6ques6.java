/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6ques6;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab6ques6 {

    /**
     * @param args the command line arguments
     */
}
class wrapper
{
    private int x;
    
    wrapper(int y)
    {
        x = y;
    }
    public int intval()
    {
        return x;
    }
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
 
        wrapper w = new wrapper(n);
        System.out.println("Wrapper class output is : "+w.intval());
        
    }
    
}
