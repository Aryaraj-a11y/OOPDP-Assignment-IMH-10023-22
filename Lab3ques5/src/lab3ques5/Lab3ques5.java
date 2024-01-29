/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3ques5;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab3ques5{

    /**
     * @param args the command line arguments
     */
  
}
   class sum
   {
       
         int Calculatesum(int[] arr)
   {
       int sum = 0;
       for( int i : arr)
       {
           sum += i;
       }
       return sum;
       
   }
      
        public static void main(String[] args) {
            sum s=new sum();
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         int[] numbers = {1,2,3,4,5,6,7,8,123};
         int sum = s.Calculatesum(numbers);
         System.out.println("Sum = "+sum);
         int reverse = 0;
         
         while(sum>0)
         {
             int lastdigit = sum%10;
             reverse = reverse*10;
             reverse += lastdigit;
             sum /= 10;
         }
         System.out.println("Reverse sum = "+reverse);
   }
   }
   