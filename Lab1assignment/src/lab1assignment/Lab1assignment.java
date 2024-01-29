/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab1assignment;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab1assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //TODO code application logic here
        System.out.println("Hello world");
        System.out.println("Hello java");
        System.out.println(args[0]+" "+args[1]+" "+args[2]+" "+args[3]+" "+args[4]+" "+args[5]+" "+args[6]+" "+args[7]+" "+args[8]);
        int i,j;
        float k;
        String s;
      Scanner sc=new Scanner(System.in);
        
        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextFloat();
        s = sc.next();
        
        System.out.println("Integers are"+" "+i+" "+"&"+" "+j);
        System.out.println("Float is"+" "+k);
        System.out.println("String is"+" "+s);
     
        int a = i+j;
        int b = i*j;
        int c = i-j;
        float d = i/j;
        
       System.out.println("Addition = "+a);
       System.out.println("Multiplication = "+b);
       System.out.println("Subtraction = "+c);
       System.out.println("Division = "+d);
        
       double x;
       long y;
        
        x = sc.nextDouble();
        y = sc.nextLong();
        
        float e = (float)x;
        long f = (long)x;
        int g = (int)y;
        
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
      
      String p,q,r;
      
      p = sc.next();
      q = sc.nextLine();
      r = sc.next();
      
      System.out.println(s);
      System.out.println(p);
      System.out.println(d);
    }
    
}

