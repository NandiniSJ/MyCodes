package String;

import org.junit.jupiter.api.Test;

import static String.StringSwapping.swapPairOfCharactersOfAString;
import static org.junit.jupiter.api.Assertions.*;

class StringSwappingTest {

    @Test
    void shouldSwapStringForOddChar(){
        String string = "nandini";

        String expectedResult = "andnnii";

        String actualResult = swapPairOfCharactersOfAString(string);

        assertEquals(expectedResult,actualResult);
    }
    @Test
    void shouldSwapStringForEvenChar(){
        String string = "java";

        String expectedResult = "ajav";

        String actualResult = swapPairOfCharactersOfAString(string);

        assertEquals(expectedResult,actualResult);
    }

}