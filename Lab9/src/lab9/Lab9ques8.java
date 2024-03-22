/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab9ques8 {
      public static void main(String[]args)
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter first string :");
          String s1 = sc.next();
          System.out.println("Enter second string :");
          String s2 = sc.next();
          if(s1.equals(s2)==true)
          {
              System.out.println("s1 is equal to s2");
          }
           
          if(s1.equalsIgnoreCase(s2))
          {
              System.out.println("True");
          }
          int x = s1.compareTo(s2);
          if(x==0)
          {
              System.out.println("The strings are lexicographically equal");
          }
          else if(x<0)
          {
              System.out.println("The first string comes before the second string in dictionary order");
          }
          else
          {
               System.out.println("The first string comes after the second string in dictionary order");
          }
    }
}

