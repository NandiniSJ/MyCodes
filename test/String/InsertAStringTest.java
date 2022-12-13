package String;

import org.junit.jupiter.api.Test;

import static String.InsertAString.InsertAStringIntoAnotherString;
import static org.junit.jupiter.api.Assertions.*;

class InsertAStringTest {

    @Test
    void shouldInsertAString(){
        String string = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;

        String expectedResult = "GeeksForGeeks";

        String actualResult = InsertAStringIntoAnotherString(string,stringToBeInserted,index);

        assertEquals(expectedResult,actualResult);
    }

}