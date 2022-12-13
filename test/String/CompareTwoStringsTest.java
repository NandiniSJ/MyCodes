package String;

import org.junit.jupiter.api.Test;

import static String.CompareTwoStrings.compareTwoStrings;
import static org.junit.jupiter.api.Assertions.*;

class CompareTwoStringsTest {

    @Test
    void shouldCompareTwoStrings(){
        String string1 = "GeeksForGeeks";
        String string2 = "Practice";

        int expectedResult = -9;

        int actualResult =compareTwoStrings(string1,string2);

        assertEquals(expectedResult,actualResult);
    }

    void shouldCompareTwoStrings1(){
        String string1 = "Geeks";
        String string2 = "Geeks";

        int expectedResult = 0;

        int actualResult =compareTwoStrings(string1,string2);

        assertEquals(expectedResult,actualResult);
    }

    void shouldCompareTwoStrings2(){
        String string1 = "GeeksForGeeks";
        String string2 = "Geeks";

        int expectedResult = 8;

        int actualResult =compareTwoStrings(string1,string2);

        assertEquals(expectedResult,actualResult);
    }

}