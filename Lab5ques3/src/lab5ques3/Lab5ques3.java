/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5ques3;

/**
 *
 * @author 91778
 */
public class Lab5ques3 {

    /**
     * @param args the command line arguments
     */
}
class Student
{
    void studentclass()
    {
        System.out.println("I am a student");
    }
}
    class CSE
    {
        void studentclass()
        {
            System.out.println("I am a CSE student");
        }
    }
    class CSEAI extends CSE
    {
        void studentclass()
        {
            System.out.println("I am a CSE AI student");
        }
    }

class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student();
        CSE c = new CSE();
        CSEAI c1 = new CSEAI();
        s.studentclass();
        c.studentclass();
        c1.studentclass();
        
    }
    
}
