/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3ques7;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab3ques7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,2,4};
         System.out.println("Enter the value of k :");
         int k = sc.nextInt();
        int i,j;
        int count = 0;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    count++;
                }
            }
        }
        System.out.println("No.of pairs with sum = "+k+ " "+"is "+count);
   } 
}
