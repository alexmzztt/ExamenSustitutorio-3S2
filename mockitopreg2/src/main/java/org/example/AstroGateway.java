package org.example;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class AstroGateway implements Gateway<AstroResponse> {
    @Override
    public AstroResponse getResponse() {
        try {
            // Creamos una instancia de HttpClient que es la clase utilizada para realizar solicitudes HTTP
            HttpClient httpClient = HttpClient.newHttpClient();
            // Configuramos la solicitud HTTP GET hacia la URL del servicio web
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create("http://api.open-notify.org/astros.json"))
                    .GET()
                    .build();
            // Enviamos la solicitud HTTP al servidor y obtenemos la respuesta.
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            // Verificamos si la respuesta tiene un código de estado 200, lo que indica un estado exitoso
            if (httpResponse.statusCode() == 200) {
                // Obtenemos el cuerpo de la respuesta, que contiene el JSON devuelto por el servicio web
                String responseJson = httpResponse.body();
                // Convertimos la respuesta JSON en una instancia de AstroResponse
                Gson gson = new Gson();
                AstroResponse astroResponse = gson.fromJson(responseJson, AstroResponse.class);
                // Retornamos los datos de los astronautas
                return astroResponse;
            } else {  // En caso de que la respuesta tenga un código de estado diferente de 200 mostraremos un mensaje de error
                System.out.println("Error al realizar la solicitud. Código de estado: " + httpResponse.statusCode());
            }
        } catch (IOException | InterruptedException e) { // Si ocurre una excepción durante la conexión o la ejecución de la solicitud mostraremos un mensaje de error
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return null;
    }
}
