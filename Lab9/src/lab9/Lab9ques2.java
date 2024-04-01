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
public class Lab9ques2 {
    
}
class Main
{
    public static void main(String[]args)
    {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of the first arraylist : ");
          int n= sc.nextInt();
          List<Integer>arr = new ArrayList<Integer>(n);
          for(int i=0;i<n;i++)
          {
            int x = sc.nextInt();
            arr.add(x);
          }
          
          System.out.println("Enter the size of the second arraylist : ");
          int m= sc.nextInt();
          List<Integer>brr = new ArrayList<Integer>(m);
          for(int i=0;i<m;i++)
          {
            int y = sc.nextInt();
            brr.add(y);
          }
          if(arr.equals(brr)==true)
          {
              System.out.println("Arraylist are equal ");
          }
          else
          {
              System.out.println("Arraylist are not equal ");
          }
          arr.addAll(brr);
          System.out.println("Enter the value to be searched in the arraylist :");
          int z = sc.nextInt();
          if(arr.contains(z)==true)
          {
              System.out.println("The element is present in the array ");
          }
          else
          {
               System.out.println("The element is not present in the array ");
          }
    }
}
