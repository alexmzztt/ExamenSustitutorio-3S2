import org.example.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AstroServiceTest {


    @Test
    public void testGetAstroData() {

        Gateway<AstroResponse> astroGateway = new AstroGateway();
        AstroService astroService = new AstroService(astroGateway);
        Map<String, Long> astroDataMap = astroService.getAstroData();

        assertEquals(7, astroDataMap.get("ISS"));
        assertEquals(3, astroDataMap.get("Tiangong"));

    }
}
