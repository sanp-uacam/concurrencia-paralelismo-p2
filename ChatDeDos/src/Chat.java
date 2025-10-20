
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Chat {

    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner tecla = new Scanner(System.in);
        String tipo;

        System.out.println("Indique si quiere ser cliente o servidor");
        tipo = tecla.nextLine();
        if (tipo.equalsIgnoreCase("cliente")) {
            System.out.println("SOY CLIENTE");
            Socket sConexcionActual = new Socket(InetAddress.getByName("localhost"), 8080);
           
            AtiendeEscritura hilosescritor = new AtiendeEscritura(sConexcionActual);
            AtiendeLectura hiloslector = new AtiendeLectura(sConexcionActual);
            
            Thread tsescritor = new Thread(hilosescritor);
            Thread tslector = new Thread(hiloslector);

            tsescritor.start();
            tslector.start();

        } else if (tipo.equalsIgnoreCase("servidor")) {
            System.out.println("SOY SERVIDOR");
            Servidor s = new Servidor();
            s.escucharCliente();

            AtiendeEscritura hilocescritor = new AtiendeEscritura(s.socket);
            AtiendeLectura hilolcector = new AtiendeLectura(s.socket);
            
            Thread tcescritor = new Thread(hilocescritor);
            Thread tclector = new Thread(hilolcector);

            tcescritor.start();
            tclector.start();
        }

        //Falta hacer un cierre elegante
    }

}
