

import java.io.*;
import java.net.*;

public class ClienteTCP {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 12345;
        
        try (Socket socket = new Socket(hostname, port);
             BufferedReader in = new BufferedReader(
                 new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(
                 socket.getOutputStream(), true);
             BufferedReader stdIn = new BufferedReader(
                 new InputStreamReader(System.in))) {
            
            System.out.println("Conectado al servidor " + hostname + ":" + port);
            
            // Hilo para recibir mensajes del servidor
            Thread receiver = new Thread(() -> {
                try {
                    String serverResponse;
                    while ((serverResponse = in.readLine()) != null) {
                        System.out.println("Servidor: " + serverResponse);
                    }
                } catch (IOException e) {
                    System.out.println("Conexión cerrada");
                }
            });
            receiver.start();
            
            // Leer entrada del usuario
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                if ("EXIT".equalsIgnoreCase(userInput)) {
                    break;
                }
            }
            
        } catch (UnknownHostException e) {
            System.err.println("Host desconocido: " + hostname);
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
}