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
public class Lab9ques5 {
    public static void main(String[]args)
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter string :");
          String s = sc.next();
          int n = s.length();
          char[]arr = s.toCharArray();
          String reverse = "";
          for(int i=n-1;i>=0;i--)
          {
            reverse += s.charAt(i);
          }
         System.out.println("Reversed string : "+reverse);
    }
}
