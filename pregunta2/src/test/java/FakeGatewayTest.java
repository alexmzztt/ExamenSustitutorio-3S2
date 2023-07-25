package org.example;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeGatewayTest {
    public static void main(String[] args) {
        // Obtenemos los datos
        FakeGateway astroGateway = new FakeGateway();
        AstroService astroService = new AstroService(astroGateway);
        Map<String, Long> astroDataMap = astroService.getAstroData();

        assertEquals(7, astroDataMap.get("ISS"));
        assertEquals(3, astroDataMap.get("Tiangong"));
    }
}
