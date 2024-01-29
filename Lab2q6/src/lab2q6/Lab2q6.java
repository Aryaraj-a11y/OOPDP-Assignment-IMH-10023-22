/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q6;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab2q6 {

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
       int i;
       int even=0,odd=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        int []brr = new int[even];
        int []crr = new int[odd];
        int evenindex=0,oddindex=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                brr[evenindex]=arr[i];
                evenindex++;
            }
            else
            {
                crr[oddindex]=arr[i];
                oddindex++;
            }
        }
        System.out.println("Even elements are : ");
        for(i=0;i<even;i++)
        {
            System.out.println(brr[i]);
        }
        System.out.println("Odd elements are : ");
          for(i=0;i<odd;i++)
        {
            System.out.println(crr[i]);
        }
         System.out.println("Elements of the original array are : ");
          for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
