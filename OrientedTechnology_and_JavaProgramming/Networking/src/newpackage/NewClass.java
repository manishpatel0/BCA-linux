/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.io.IOException;
import java.net.Socket;
/**
 *
 * @author workflow
 */
public class NewClass {
    
    public static void main(String[] args) {
        Socket MyClient;
        try {
            MyClient = new Socket("Mackine name", 21); // ftp : 21 postNumber
                    
        }
        catch(IOException e) {
            System.out.println(e);
        }
        
    }
    
}
