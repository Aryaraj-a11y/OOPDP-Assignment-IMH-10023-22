/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab2ques1;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab2ques1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int sizeOfarray = sc.nextInt();
        int[] arr = new int[sizeOfarray];
        System.out.println("Enter total number of elements present in the array :");
        int numberOfElement = sc.nextInt();
        System.out.println("Elements of the array are :");
        for(int i=0;i<numberOfElement;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<numberOfElement;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}

