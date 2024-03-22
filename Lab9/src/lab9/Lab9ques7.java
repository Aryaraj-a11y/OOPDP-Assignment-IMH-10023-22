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
public class Lab9ques7 {
    
    public static String findMissingcharacters(String str)
    {
        String s1 = "";
        for(char ch = 'a';ch<='z';ch++)
        {
            boolean found = false;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==ch)
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                s1 += ch;
            }
        }
        return s1;
    }

     public static void main(String[]args)
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter string :");
          String s = sc.next().toLowerCase();
          String s1 = findMissingcharacters(s);
          if(s1.isEmpty())
          {
              System.out.println("All the characters from the alphabet are present in the string");
          }
          else
          {
              System.out.println("Missing characters : "+s1);
          }
    }
    
}
