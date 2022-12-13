package String;

import org.junit.jupiter.api.Test;

import static String.RemoveLeadingZeros.removeLeadingZeros;
import static org.junit.jupiter.api.Assertions.*;

class RemoveLeadingZerosTest {

    @Test
    void shouldRemoveLeadingZeros(){
        String string = "00000123569";

        String expectedResult = "123569";

        String actualResult = removeLeadingZeros(string);

        assertEquals(expectedResult,actualResult);
    }

}