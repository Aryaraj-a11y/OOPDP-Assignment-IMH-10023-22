/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3ques4;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab3ques4 {

    /**
     * @param args the command line arguments
     */
}
class Main
{
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        
        char[] CharArray = str.toCharArray();
        for(int i=0;i<CharArray.length;i++)
        {
            CharArray[i] = Character.toLowerCase(CharArray[i]);
        }
        
        String resultstring = new String(CharArray);
        
        System.out.print("String after conversion to lowercase : "+resultstring);
        System.out.println();
        
         int count = 0;
        for(int i=0;i<CharArray.length;i++)
        {
          count++;
        }
        System.out.print("Length of the total String : "+count);
        System.out.println();
    }
}
