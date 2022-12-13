package String;

import org.junit.jupiter.api.Test;

import java.util.*;

import static String.Substrings.findNumberOfSubstrings;
import static org.junit.jupiter.api.Assertions.*;

class SubstringsTest {

    @Test
    void shouldFindNumberOfSubstrings(){
        String string = "The Cat";

        List<String> expectedResult = List.of("T", "Th", "The", "The ","The C", "The Ca", "The Cat", "h", "he", "he ","he C", "he Ca", "he Cat", "e", "e ","e C", "e Ca", "e Cat"," "," C"," Ca"," Cat", "C", "Ca", "Cat", "a", "at", "t");

        List<String> actualResult =findNumberOfSubstrings(string);

        assertEquals(expectedResult,actualResult);

    }

}