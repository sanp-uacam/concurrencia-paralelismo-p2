
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

class Atendedor {

    protected Socket s;
    protected BufferedReader input;
    protected PrintWriter output;

    Atendedor(Socket s) {
        this.s = s;
        InputStream IN;
        OutputStream OUT;
        try {
            IN = s.getInputStream();
            OUT = s.getOutputStream();
            input = new BufferedReader(new InputStreamReader(IN));
            output = new PrintWriter(new OutputStreamWriter(OUT));
        } catch (IOException e) {
            // TODO Auto-generated catch block

        }

    }

}
