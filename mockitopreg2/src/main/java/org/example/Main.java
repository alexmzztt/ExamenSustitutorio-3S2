package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Obtenemos los datos
        Gateway<AstroResponse> astroGateway = new AstroGateway();
        AstroService astroService = new AstroService(astroGateway);
        Map<String, Long> astroDataMap = astroService.getAstroData();

        // Imprimimos los resultados de la cantidad de astronautas por nave espacial
        for (Map.Entry<String, Long> entry : astroDataMap.entrySet()) {
            System.out.println(entry.getValue() + " astronautas a bordo de " + entry.getKey());
        }
        // Obtener la respuesta completa en formato JSON y imprimirlo
        AstroResponse astroResponse = astroGateway.getResponse();
        if (astroResponse != null) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonResponse = gson.toJson(astroResponse);
            System.out.println("Datos completos en formato JSON:");
            System.out.println(jsonResponse);
        }
    }
}
