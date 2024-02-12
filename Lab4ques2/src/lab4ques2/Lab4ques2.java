/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4ques2;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab4ques2 {

    /**
     * @param args the command line arguments
     */
}
class car
{
    String brand;
    car()
    {
       brand = "Ford";
    }
    void getbrand()
    {
        String x = brand;
        System.out.println(x);
    }
}
class Sample
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        car obj = new car();
        obj.getbrand();
    }
}
    

