/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.TCP;

/**
 *
 * @author workflow
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class myclient {
//    TCP connection example
//    : (Client
//    )

    public static void main(String[] s) {
        try {
            InetAddress addr = InetAddress.getByName(“ohm.uwaterloo.ca
            ”);
Socket s = new Socket(addr, 80);
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
// communicate with remote process
// e.g. GET document /~ece454/index.html
            s.close();
        } catch (Exception e) {
            System.out.println(“Exception
            
        
    
        
    

”);
// do something about the Exception
}
}
}
    
}
