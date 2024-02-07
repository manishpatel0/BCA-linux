/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.net.*;
/**
 *
 * @author workflow
 */
public class URL_Test {
    
    public static void main(String[] args)  throws MalformedURLException{
        URL rebURl = new URL("http://in.rediff.com/index.html");
        System.err.println("URl Prtocal: " + rebURl.getProtocol());
        System.err.println("URl Port: " + rebURl.getPort());
        System.err.println("URl Host: " + rebURl.getHost());
        System.err.println("URl File: " + rebURl.getFile());
    }
    
}
