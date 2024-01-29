/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q7;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab2q7 {

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
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter position of division of array :");
        int pos = sc.nextInt();
        int []brr = new int[n];
        int []crr = new int[n];
        int x=0,y=0,h,k;
        for(i=0;i<n;i++)
        {
           if(i<=pos)
           {
               brr[x]=arr[i];
               x++;
           }
           else
           {
               crr[y]=arr[i];
               y++;
           }
           System.out.println("First divided array");
            for(h=0;h<x;h++)
            {
                System.out.println(brr[h]);
            }
            for(h=0;h<x;h++)
            {
                int c = 0;
                for(k=0;k<x;k++)
                {
                    if(brr[h]==brr[k])
                    {
                      c++;  
                    }
                }
                 System.out.println("Element "+brr[h]+" has frequency "+c);
            }
            System.out.println("Second divided array");
            for(h=0;h<y;h++)
            {
                System.out.println(crr[h]);
            }
            for(h=0;h<y;h++)
            {
                int c = 0;
                for(k=0;k<x;k++)
                {
                    if(crr[h]==crr[k])
                    {
                      c++;  
                    }
                }
                 System.out.println("Element "+crr[h]+" has frequency "+c);
            }
        }
       
    }
    
}
