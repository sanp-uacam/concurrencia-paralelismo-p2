/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uacam.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

/**
 *
 * @author sergi
 */
public class ServidorUDP {

    public static void main(String[] args) {
        final int PORT = 5000;
        byte[] buffer = new byte[1024];

        try {
            System.out.println("UPD server");
            DatagramSocket socketUDP = new DatagramSocket(PORT);

            DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);

            socketUDP.receive(peticion);

            String msj = new String(peticion.getData());
            System.err.println(msj);

            int clientPORT = peticion.getPort();
            InetAddress clientIP = peticion.getAddress();

            msj = "Hello from server";
            buffer = msj.getBytes();

            DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, clientIP, clientPORT);
            
            System.out.println("Envio la informacion del cliente");
            socketUDP.send(respuesta);

        } catch (Exception e) {
        }

    }
}
