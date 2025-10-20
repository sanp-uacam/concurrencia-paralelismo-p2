
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public Socket clienteConectado = null;
    public Socket socket = null;
    private ServerSocket Socketmio;

    Servidor() {
        try {
            Socketmio = new ServerSocket(8080);
            System.out.println("Servidor iniciado en puerto 8080");
        } catch (IOException e) {
            System.err.println("Error al iniciar servidor: " + e.getMessage());
        }
    }

    public void escucharCliente() {
        try {
            socket = Socketmio.accept();
            System.out.println("Cliente conectado :" + " desde IP" + socket.getInetAddress()
                    + " desde el puerto " + socket.getPort()
            );
        } catch (IOException e) {
 
        }
    }

    public void dispose() {
        try {
            Socketmio.close();
        } catch (IOException e) {
        }
    }


}
