package ListExamples;

import org.junit.jupiter.api.Test;

import java.util.*;

import static ListExamples.ListOfStringToString.convertListOfStringToString;
import static org.junit.jupiter.api.Assertions.*;

class ListOfStringToStringTest {

    @Test
    void shouldConvertListOfStringToString(){
        List<String> list = List.of("Geeks", "ForGeeks", "GeeksForGeeks");

        String expectedResult = "Geeks,ForGeeks,GeeksForGeeks";

        String actualResult = convertListOfStringToString(list);

        assertEquals(expectedResult,actualResult);

    }

}