/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAb2ques2;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class LAb2ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the capacity of an array:");
        int cap = sc.nextInt();
        int arr[] = new int[cap];
        
        System.out.println("Enter number of elements in an array:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
    }
    
    System.out.println("Enter index:");
    int position = sc.nextInt();
    
     System.out.println("Enter the element to be inserted:");
    int element = sc.nextInt();
    
    for(int j=n-1;j>=position;j--)
    {
        arr[j+1] = arr[j];
        
    }
     arr[position] = element;
     
     for(int j=0;j<n+1;j++)
     {
      System.out.println(arr[j]);
 }
 }
}
