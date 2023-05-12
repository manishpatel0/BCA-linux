/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coding;
import java.lang.Thread;
import java.lang.Runnable;
/**
 *
 * @author manish
 */

class Call_Test {
    
    synchronized void cellme(String msg) {
        // THis prevents other threads from entering cal() while another thread is using it.
        System.err.print(" [ " + msg);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e ){
            System.out.println("Thread is Interrupter");
        }
        System.out.println(" ] ");
    }
}

public class Call implements Runnable{
    
    String msg;
    Call_Test ob1;
    Thread t;
    
    public Call(Call_Test tar, String s){
        System.out.println("Inside Caller method");
        ob1 = tar;
        msg = s;
        t = new Thread(this);
        t.start();
        
    }
    
    public void run() {
        ob1.cellme(msg);
    }
    
    public static void main(String[] args) {
        Call_Test t = new Call_Test();
        Call ob1 = new Call(T,"Hi");
        Call ob2 = new Call(T, "This");
        Call ob3 = new Call(T,"is");
        Call ob4 = new Call(T, "Synchroinization");
        Call ob5 = new Call(T, "Test");
        
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
            ob4.t.join();
            ob5.t.join();
            
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        
        
    }
    
}
