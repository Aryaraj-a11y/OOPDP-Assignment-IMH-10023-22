/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9;

import java.util.*;

/**
 *
 * @author 91778
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arraylist : ");
        int n= sc.nextInt();
        List<Integer>arr = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            arr.add(x);
        }
        arr.add(6);
        arr.add(7);
        arr.add(8);
        System.out.println(arr);
        arr.remove(2);
        Collections.sort(arr);
        System.out.println(arr);
        
         List<String>brr = new ArrayList<String>(3);
         for(int i=0;i<3;i++)
        {
            String y = sc.next();
            brr.add(y);
        }
         brr.add("abc");
         brr.add("def");
         System.out.println(brr);
         brr.add(0,"xyz");
         brr.remove(2);
         Collections.sort(brr);
         System.out.println(brr);
    }   
}

