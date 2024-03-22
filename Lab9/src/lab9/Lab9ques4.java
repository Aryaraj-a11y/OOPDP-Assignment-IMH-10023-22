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
public class Lab9ques4 {
    

      public static void main(String[]args)
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter first string :");
          String s1 = sc.next();
          System.out.println("Enter second string :");
          String s2 = sc.next();
          
          int n = s1.length();
          int m = s2.length();
          char[]A = s1.toCharArray();
          char[]B = s2.toCharArray();
          Arrays.sort(A);
          Arrays.sort(B);
          if(n!=m)
          {
             System.out.println("Strings are not anagram to each other");
          }
          else
          {
              int flag = 0;
              for(int i=0;i<n;i++)
              {
                  if(A[i]!=B[i])
                  {
                      flag = 1;
                      break;
                  }
                  
              }
              if(flag==0)
              {
                  System.out.println("Strings are anagram to each other");
              }
              else
              {
                  System.out.println("Strings are not anagram to each other");
              }
          }
    }
}

