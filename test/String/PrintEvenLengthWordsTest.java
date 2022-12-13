package String;

import org.junit.jupiter.api.Test;

import java.util.List;

import static String.PrintEvenLengthWords.printEvenLengthWords;
import static org.junit.jupiter.api.Assertions.*;

class PrintEvenLengthWordsTest {

    @Test
    void shouldPrintEvenLengthWords(){
        String string = "This is a java language";

        List<String> expectedResult =List.of("This", "is", "java", "language");

        List<String> actualResult = printEvenLengthWords(string);

        assertEquals(expectedResult,actualResult);
    }

}