/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6ques5;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab6ques5 {

    /**
     * @param args the command line arguments
     */
}
class printnumber
{
    //Integer a;
    //Float b;
    //Double c;
    //Long l;
    //Short s;
    //Byte m;
    
    void autoboxing(int x)
    {
        System.out.println("Integer = "+x);
    }
    void autoboxing(Float f)
    {
        System.out.println("Float = "+f);
    }
    void autoboxing(Double d)
    {
        System.out.println("Double = "+d);
    }
    void autoboxing(Long l1)
    {
        System.out.println("Long = "+l1);
    }
    void autoboxing(Short s1)
    {
        System.out.println("Short = "+s1);
    }
    void autoboxing(Byte n)
    {
        System.out.println("Byte = "+n);
    }
}
class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        printnumber p = new printnumber();
        System.out.println("Enter the integer value : ");
        Integer i = sc.nextInt();
        System.out.println("Enter the float value : ");
        Float j = sc.nextFloat();
        System.out.println("Enter the double value : ");
        Double k = sc.nextDouble();
        System.out.println("Enter the long value : ");
        Long x = sc.nextLong();
        System.out.println("Enter the short value : ");
        Short y = sc.nextShort();
        System.out.println("Enter the byte value : ");
        Byte z = sc.nextByte();
        
        p.autoboxing(i);
        p.autoboxing(j);
        p.autoboxing(k);
        p.autoboxing(x);
        p.autoboxing(y);
        p.autoboxing(z);
    }
    
}
