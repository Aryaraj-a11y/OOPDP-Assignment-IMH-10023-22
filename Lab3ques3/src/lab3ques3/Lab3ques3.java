/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3ques3;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab3ques3 {

    /**
     * @param args the command line arguments
     */
    int i,j;
    int count = 0,max=0;
    void meth(int ... a)
    {
        for(i=0;i<a.length;i++)
        {
            count++;
        }
        System.out.println("Total number of arguments is "+count);
        for(i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
         System.out.println("The maximum element in the list is  "+max);
         int sum = 0 ;
         for(i=0;i<a.length;i++)
         {
             sum += a[i];
         }
        System.out.println("The sum of all the elements in the list is  "+sum);
    }
    //void meth1(int ... b,float c)
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Lab3ques3 obj = new Lab3ques3();
        obj.meth(34,56,78,90,122);
    }
    
}
