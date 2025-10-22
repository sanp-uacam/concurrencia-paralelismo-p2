/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrentChat;

import Handlers.WriteHandler;
import Handlers.ReadHandler;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Cliente {

    public static void main(String[] args) throws IOException {
        final int PORT = 8080;
        final String ADDRESS = "localhost";

        Socket conection = new Socket(ADDRESS, PORT);

        WriteHandler writer = new WriteHandler(conection);
        ReadHandler reader = new ReadHandler(conection);

        Thread writeThread = new Thread(writer);
        Thread readThread = new Thread(reader);

        writeThread.start();
        readThread.start();
    }
}
