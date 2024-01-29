/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3ques8;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab3ques8 {

    /**
     * @param args the command line arguments
     */
    int check(int n,int r,int m)
    {
        if(n==r)
        {
            return 1;
        }
        else
        {
          return -1;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,5,6,1,2,9};
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            count++;
        }
        int leftsum;
        int rightsum;
        int i,j;
        
      for(i=0;i<count;i++)
      {
           leftsum=0;
           rightsum = 0;
          for(j=0;j<i;j++)
          {
              leftsum += arr[j];
          }
           for(j=i+1;j<count;j++)
          {
              rightsum += arr[j];
          }
        Lab3ques8 obj = new Lab3ques8();
        obj.check(leftsum,rightsum,i);
    }
}
    
}
