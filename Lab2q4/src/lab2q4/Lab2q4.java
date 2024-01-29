/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q4;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab2q4 {

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
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       System.out.println("Enter the element to be searched in the array :");
       int element = sc.nextInt();
       int flag = 0;
       for(int i=0;i<n;i++)
        {
            if(arr[i]==element)
            {
                flag = 1;
                System.out.println("The element is present in the array ");
            }
        }
       if(flag==0)
       {
            System.out.println("The element is not present in the array ");
       }
    }
    
}
