package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AstroService {
    private final Gateway<AstroResponse> astroGateway;
    public AstroService(Gateway<AstroResponse> astroGateway) {
        this.astroGateway = astroGateway;
    }
    public Map<String, Long> getAstroData() {
        Map<String, Long> astroDataMap = new HashMap<>(); //Creamos un nuevo mapa para almacenar los datos
        AstroResponse astroResponse = astroGateway.getResponse();
        // Verificamos si la respuesta es no nula
        if (astroResponse != null) {
            List<Assignment> people = astroResponse.getPeople(); // Obtenemos la lista de astronautas de la respuesta
            for (Assignment assignment : people) { // Para cada asignación de astronauta en la lista people
                String craft = assignment.getCraft(); //Obtenemos el nombre de la nave espacial (craft) de la asignación actual
                astroDataMap.put(craft, astroDataMap.getOrDefault(craft, 0L) + 1);
                // Actualizamos el mapa astroDataMap con la cantidad de astronautas por nave espacial
                // si la nave espacial ya esta presente en el mapa entonces incrementamos el valor actual en 1
                // y si la nave espacial no esta presente en el mapa entonces agregamos una nueva entrada con valor 1
            }
        }
        return astroDataMap; // Devolvemos el mapa astroDataMap que contiene la cantidad de astronautas por nave espacial
    }
}
