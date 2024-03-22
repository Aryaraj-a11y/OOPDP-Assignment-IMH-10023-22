/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author 91778
 */
import java.util.*;
public class Lab9ques9 {
   public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter first string :");
          String s1 = sc.next();
          System.out.println("Enter second string :");
          String s2 = sc.next();
          if(s1.charAt(0)>s2.charAt(0))
          {
              System.out.println("positive");
          }
           
          if(s1.charAt(0)<s2.charAt(0))
          {
              System.out.println("Negative");
          }
          int x = s1.compareTo(s2);
          if(x==0)
          {
              System.out.println("0");
          }
         
     }
 }

