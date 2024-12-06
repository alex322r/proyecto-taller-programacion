import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Server {

    public void startServer() throws IOException {
        // Crear el servidor HTTP en el puerto 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);

        // Definir un handler para servir el archivo HTML
        server.createContext("/reporte", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String filePath = "reporte.html";

                // Leer el archivo HTML
                byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));

                // Enviar respuesta HTTP
                exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
                exchange.sendResponseHeaders(200, fileBytes.length);
                OutputStream os = exchange.getResponseBody();
                os.write(fileBytes);
                os.close();
            }
        });

        // Iniciar el servidor
        server.setExecutor(null); // Usa un ejecutor predeterminado
        server.start();

        System.out.println("Servidor iniciado en http://localhost:8080/reporte");
    }
}
