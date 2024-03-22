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
public class Lab9ques10 {
     public static void main(String[]args)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first string :");
       String s1 = sc.next();
       System.out.println("Enter second string :");
       String s2 = sc.next();
       
       boolean isPalindrome1 = isPalindrome(s1);
       boolean isPalindrome2 = isPalindrome(s2);

        if (isPalindrome1 && isPalindrome2) 
        {
            String concatenatedString = s1 + s2;
            System.out.println("Both strings are palindromes.");
            System.out.println("Concatenated string: " + concatenatedString);
        } 
        else
        {
            System.out.println("At least one of the entered strings is not a palindrome.");
        }
    }
     
      private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}

