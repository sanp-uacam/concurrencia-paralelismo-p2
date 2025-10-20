import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class AtiendeEscritura extends Atendedor implements Runnable {

    private String mensajeTX = "_";

    AtiendeEscritura(Socket s) {
        super(s);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        try {
            Scanner msjScanner = new Scanner(System.in);

            while (output != null
                    && !mensajeTX.equalsIgnoreCase("adios")) {
                mensajeTX = msjScanner.nextLine();
                output.print(mensajeTX + "\r\n");
                System.out.println("me: " + mensajeTX);
                output.flush();
            }
            s.close();
            System.exit(0); 

        } catch (IOException e) {
            // TODO Auto-generated catch block

        }
    }

}
