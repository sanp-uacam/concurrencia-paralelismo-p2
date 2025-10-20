import java.io.IOException;
import java.net.Socket;

public class AtiendeLectura extends Atendedor implements Runnable {

    private String mensajeRX = "_";

    AtiendeLectura(Socket s) {
        super(s);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        try {

            do {
                if (input.ready()) {
                    mensajeRX = input.readLine();
                    System.out.println("contacto: " + mensajeRX);
                }

            } while (!mensajeRX.equalsIgnoreCase("adios"));
            s.close();
            System.exit(0); 

        } catch (IOException e) {
            // TODO Auto-generated catch block

        }
    }

}
