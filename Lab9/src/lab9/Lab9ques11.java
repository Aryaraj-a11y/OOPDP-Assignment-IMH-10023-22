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
public class Lab9ques11 {
     public static void main(String[]args)
     {
         Scanner sc = new Scanner(System.in);
       System.out.println("Enter first string :");
       String s1 = sc.next();
       System.out.println("Enter second string :");
       String s2 = sc.next();
       System.out.println("Enter second string :");
       String s3 = sc.next();
       
       boolean res = s1.endsWith(s3)&& s2.endsWith(s3);
       System.out.println("Result : "+res);
     }
   
}
