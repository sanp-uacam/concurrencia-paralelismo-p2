
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ServidorHTTPBasico {
    public static void main(String[] args) throws IOException {
        // Crear servidor en puerto 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        
        // Crear contextos (rutas)
        server.createContext("/", new MyHandler());
        server.createContext("/saludo", new SaludoHandler());
        server.createContext("/api/info", new ApiHandler());
        
        // Establecer executor
        server.setExecutor(null);
        
        // Iniciar servidor
        server.start();
        System.out.println("Servidor iniciado en http://localhost:8080");
        System.out.println("Rutas disponibles:");
        System.out.println("  - http://localhost:8080/");
        System.out.println("  - http://localhost:8080/saludo");
        System.out.println("  - http://localhost:8080/api/info");
    }
    
    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = """
                <html>
                <body>
                    <h1>Servidor HTTP Java</h1>
                    <p>¡Servidor funcionando correctamente!</p>
                    <ul>
                        <li><a href='/saludo'>Saludo</a></li>
                        <li><a href='/api/info'>API Info</a></li>
                    </ul>
                </body>
                </html>""";
            
            exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
            exchange.sendResponseHeaders(200, response.getBytes().length);
            
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
    
    static class SaludoHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = """
                <html>
                <body>
                    <h1>¡Hola Mundo!</h1>
                    <p>Este es un servidor Java simple</p>
                    <a href='/'>Volver al inicio</a>
                </body>
                </html>""";
            
            exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
            exchange.sendResponseHeaders(200, response.getBytes().length);
            
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
    
    static class ApiHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = String.format("""
                {
                    "servidor": "Java HTTP Server",
                    "version": "1.0",
                    "estado": "activo",
                    "timestamp": %d
                }""", System.currentTimeMillis());
            
            exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
            exchange.sendResponseHeaders(200, response.getBytes().length);
            
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}