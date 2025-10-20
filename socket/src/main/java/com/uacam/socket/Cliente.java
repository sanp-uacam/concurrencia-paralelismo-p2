/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uacam.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author sergi
 */
public class Cliente {
    public static void main(String[] args) {
        final String HOST = "127.0.0.1";
        final int PORT = 8080;
        
        DataInputStream in;
        DataOutputStream out;
        
        try {
            Socket sc = new Socket(HOST, PORT);
           
            
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            out.writeUTF("Hello from client");
            
            String msj = in.readUTF();
            System.out.println(msj);
            
            sc.close();
            
        } catch (IOException ex) {
            System.getLogger(Cliente.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
    }
    
}
