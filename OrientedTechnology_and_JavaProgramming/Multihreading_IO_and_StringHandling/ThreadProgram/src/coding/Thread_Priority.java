/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coding;
import java.lang.Thread;
/**
 *
 * @author manish
 */
public class Thread_Priority {
    
    public static void main(String[] args) {
        try {
            Thread Td1 = new Thread("Thread1");
            Thread Td2 = new Thread("Thread2");
            System.out.println("Before any change in defoalt priority:");
            System.out.println("The Priority of " + Td1.getName() + " is " + Td1.getPriority());
            System.out.println("The Priority of " + Td2.getName() + " is " + Td2.getPriority());
            // change in priority
            Td1.setPriority(7);
            Td2.setPriority(8);
            System.out.println("After any change in defoalt priority:");
            System.out.println("The Priority of " + Td1.getName() + " is " + Td1.getPriority());
            System.out.println("The Priority of " + Td2.getName() + " is " + Td2.getPriority());
            
            
        } catch (Exception e) {
            System.out.println("Main THread interrupted");
        }
    }
    
}
