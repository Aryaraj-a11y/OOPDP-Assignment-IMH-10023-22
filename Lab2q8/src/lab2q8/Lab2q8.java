/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q8;

import java.util.Scanner;

/**
 *
 * @author 91778
 */
public class Lab2q8 {

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
       int i,max=arr[0];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("The peak element in the array is "+max);
    }
    
}
