package String;

import org.junit.jupiter.api.Test;

import static String.StringPangram.isStringPangram;
import static org.junit.jupiter.api.Assertions.*;

class StringPangramTest {

    @Test
    void shouldCheckIsStringPangram(){
        String string = "nandini";

        String expectedResult = "No";

        String actualResult = isStringPangram(string);

        assertEquals(expectedResult,actualResult);

    }

}