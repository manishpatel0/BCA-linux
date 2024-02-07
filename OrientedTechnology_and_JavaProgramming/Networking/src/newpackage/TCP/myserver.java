/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.TCP;

/**
 *
 * @author workflow
 * 
 * TCP connection example: (Server)
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class myserver {
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(80);
            while(true) {
                // wait for a connection request from client
                Socket clientConn = s.accept();
                InputStream in = clientConn.getInputStream();
                OutputStream out = clientConn.getOutputStream();
                //communicate with client
                // ..
               clientConn.close(); // close client connection       
            }
        } catch (Exception e) {
            System.out.println("Exception!");
            //do something about the exception
        }
    }
    
}
