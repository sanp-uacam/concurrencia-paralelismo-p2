/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uacam.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author sergi
 */
public class Servidor {
    
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        
        DataInputStream in;
        DataOutputStream out;
        
        final int PORT = 8080;
        
        try {
            servidor = new ServerSocket(PORT);
            
            while (true) {    
                //socket del cliente
                sc = servidor.accept();
                
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                String msj = in.readUTF();
                System.out.println(msj);
                
                out.writeUTF("hello from server");
                
                sc.close();
            }
            
        } catch (IOException ex) {
            System.getLogger(Servidor.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
