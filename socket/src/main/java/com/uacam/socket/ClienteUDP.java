/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uacam.socket;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sergi
 */
public class ClienteUDP {
     public static void main(String[] args) {

        final int SERVER_PORT = 5000;
        byte[] buffer = new byte[1024];

        try {
            InetAddress direccionServidor = InetAddress.getByName("localhost");

            DatagramSocket socketUDP = new DatagramSocket();

            String mensaje = "Hello from client";

            buffer = mensaje.getBytes();

            DatagramPacket pregunta = new DatagramPacket(buffer, buffer.length, direccionServidor, SERVER_PORT);

            System.out.println("Envio el datagrama");
            socketUDP.send(pregunta);

            DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);

            socketUDP.receive(peticion);
            System.out.println("Recibo la peticion");

            mensaje = new String(peticion.getData());
            System.out.println(mensaje);


            socketUDP.close();

        } catch (SocketException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
