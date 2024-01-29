/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab2ques3;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab2ques3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        System.out.println("Enter total elements present in the array : ");
        int totalElement = sc.nextInt();
        int arr[] = new int[totalElement];
        System.out.println("Enter array elements:");
        
        for(int i=0;i<totalElement;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index whose value is to be deleted:");
        int loc = sc.nextInt();
        for(int i=loc;i<totalElement-1;i++)
        {
            arr[i]=arr[i+1];
        }
        for(int i=0;i<totalElement-1;i++)
        {
            System.out.println(arr[i]);
        }
}
}

