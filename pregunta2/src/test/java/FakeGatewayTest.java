import org.example.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class FakeGatewayTest {
    @Test
    public void testFakeGateway() {
        // Obtenemos los datos
       Map<String, Long> astroDataMap = new FakeGateway().getResponse();

        assertEquals(7, astroDataMap.get("ISS"));
        assertEquals(3, astroDataMap.get("Tiangong"));
    }
}
