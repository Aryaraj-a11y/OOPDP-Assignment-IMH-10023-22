/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4ques1;

/**
 *
 * @author 91778
 */
import java.util.Scanner;
public class Lab4ques1 {

    /**
     * @param args the command line arguments
     */
}
class Employee
{
    int Employee_id;
    public String Employee_name;
    private String Employee_department;
    
    void setEmployee_department(String s)
    {
        Employee_department = s;

    }
    String getEmployee_department()
    {
        return Employee_department;
    }
    
 }
class accessEmployee
{
public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id : ");
        int id = sc.nextInt();
        System.out.println("Enter the employee name : ");
        String name = sc.next();
        System.out.println("Enter the employee department : ");
        String depart = sc.next();
        Employee obj = new Employee();
        obj.Employee_id = id;
        obj.Employee_name = name;
        obj.setEmployee_department(depart);
        
       System.out.println("Employee name is : "+obj.Employee_name);
       System.out.println("Employee id is : "+obj.Employee_id);
       System.out.println("Employee department is : "+obj.getEmployee_department());
        
}  
}


