/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrentChat;

import Handlers.WriteHandler;
import Handlers.ReadHandler;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Cliente {

    private static int PORT = 8080;
    private static String ADDRESS = "localhost";
    
    public static Socket conection = null;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner( System.in);
        
        String commands = scanner.nextLine();
        
        switch (commands) {
            case "start-conection":
                StartConection(PORT, ADDRESS);
                break;
            default:
                throw new AssertionError();
        }
        
        
        WriteHandler writer = new WriteHandler(conection);
        ReadHandler reader = new ReadHandler(conection);

        Thread writeThread = new Thread(writer);
        Thread readThread = new Thread(reader);

        writeThread.start();
        readThread.start();
        
    }

    public static void StartConection(int port, String address) {
        //IMPLEMTAR: ip y port, sean dinamicos.
        //solicitar ip y port.
        //Mejora: cambiar coneccion. 0.25
        try {
            conection = new Socket(address, port);
        } catch (IOException ex) {
            System.getLogger(Cliente.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

}
