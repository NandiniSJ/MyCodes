package String;

import org.junit.jupiter.api.Test;

import static String.ReverseString.findReverseString;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void ShouldFindReverseOfString(){
        String string = "shilu";

        String expectedResult = "ulihs";

        String actualResult = findReverseString(string);

        assertEquals(expectedResult, actualResult);
    }

}