

import java.io.*;
import java.net.*;
import java.util.Date;

public class ServidorSocketTCP {
    private static final int PUERTO = 12345;
    
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PUERTO)) {
            System.out.println("Servidor TCP iniciado en puerto " + PUERTO);
            System.out.println("Esperando conexiones...");
            
            while (true) {
                // Esperar conexión de cliente
                Socket clientSocket = serverSocket.accept();
                
                // Manejar cliente en hilo separado
                new Thread(new ManejadorCliente(clientSocket)).start();
            }
            
        } catch (IOException e) {
            System.err.println("Error en servidor: " + e.getMessage());
        }
    }
    
    static class ManejadorCliente implements Runnable {
        private Socket clientSocket;
        
        public ManejadorCliente(Socket socket) {
            this.clientSocket = socket;
        }
        
        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter out = new PrintWriter(
                    clientSocket.getOutputStream(), true)) {
                
                String clientAddress = clientSocket.getInetAddress().getHostAddress();
                System.out.println("Cliente conectado: " + clientAddress);
                
                // Enviar mensaje de bienvenida
                out.println("Bienvenido al servidor Java - " + new Date());
                out.println("Comandos disponibles: TIME, ECHO <texto>, EXIT");
                
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Cliente " + clientAddress + ": " + inputLine);
                    
                    if ("EXIT".equalsIgnoreCase(inputLine)) {
                        out.println("¡Hasta luego!");
                        break;
                    } else if ("TIME".equalsIgnoreCase(inputLine)) {
                        out.println("Hora del servidor: " + new Date());
                    } else if (inputLine.toUpperCase().startsWith("ECHO ")) {
                        String echoText = inputLine.substring(5);
                        out.println("ECO: " + echoText);
                    } else {
                        out.println("Comando no reconocido: " + inputLine);
                    }
                }
                
                System.out.println("Cliente desconectado: " + clientAddress);
                
            } catch (IOException e) {
                System.err.println("Error con cliente: " + e.getMessage());
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    System.err.println("Error cerrando socket: " + e.getMessage());
                }
            }
        }
    }
}