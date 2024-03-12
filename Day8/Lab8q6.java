/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author acer
 */
import java.util.*;
public class Lab8q6 {
    
}
abstract class phone
{
   void call()
   {
       System.out.println("In method call");
   }
   void sms()
   {
        System.out.println("In method sms");
   }
}
interface camera
{
    void click();
    void Record();
}
interface Musicplayer
{
    void play();
    void pause();
    void stop();
}
 class smartphone extends phone implements camera,Musicplayer
{
   public void click()
   {
       System.out.println("In click");
   }
    public void Record()
    {
        System.out.println("In Record");
    }
    public void play()
    {
        System.out.println("In Play");
    }
    public void pause()
    {
         System.out.println("In Pause");
    }
    public void stop()
    {
         System.out.println("In stop");
    }
}

class ma
{
    public static void main(String[]args)
    {
        smartphone s = new smartphone();
        s.call();
        s.sms();
        s.click();
        s.Record();
        s.play();
        s.pause();
        s.stop();
    }
}
