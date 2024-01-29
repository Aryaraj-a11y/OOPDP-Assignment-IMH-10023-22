/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q5;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author 91778
 */
public class Lab2q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array : ");
       int n = sc.nextInt();
       int []arr = new int[n];
       System.out.println("Enter array elements:");
       int i,j;
       int count=0,flag = 1;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag = 0;
                    count++;
                    System.out.println("The duplicate element is "+arr[i]);
                }    
            }
        }
        if(flag==1)
        {
           System.out.println("No duplicate element is present in the array : "); 
        }
        System.out.println("The frequency of ocurrence of duplicate element is "+count);
   }
}
