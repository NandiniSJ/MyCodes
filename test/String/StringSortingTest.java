package String;

import org.junit.jupiter.api.Test;

import static String.StringSorting.sortAString;
import static org.junit.jupiter.api.Assertions.*;

class StringSortingTest {

    @Test
    void shouldSortString(){
        String string = "nandini";
        String expectedResult = "adiinnn";
        String actualResult = sortAString(string);

        assertEquals(expectedResult,actualResult);

    }

}