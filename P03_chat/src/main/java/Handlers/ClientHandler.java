/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Set;

/**
 *
 * @author sergi
 */
public class ClientHandler implements Runnable{

    private final Socket socket;
    private final Set<ClientHandler> clients;
    private BufferedReader in;
    private PrintWriter out;
    
    String username = "";

    public ClientHandler(Socket clientSocket, Set<ClientHandler> clients) {
         this.socket = clientSocket;
         this.clients = clients;
    }
    
    @Override
    public void run (){
        
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            
            Thread.sleep(500);
            
            out.println("se ha establecido la conexión");
            out.flush();
            
            out.println("introduce tu nombre de usuario:");
            out.flush();
            
            String inputMessage = "";
            
            do {                
                if(in.ready()){
                    inputMessage = in.readLine();
                    
                    username = inputMessage;
                    
                    System.err.println(username + "se ha unido al chat");
                    
                }
            } while (!inputMessage.equalsIgnoreCase("/exit"));
            
            
        } catch (IOException ex) {
            System.getLogger(ClientHandler.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (InterruptedException ex) {
            System.getLogger(ClientHandler.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
