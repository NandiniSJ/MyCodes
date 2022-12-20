package ListExamples;
import java.util.List;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static ListExamples.AddElement.addElementAtFirstAndLastPosition;
import static org.junit.jupiter.api.Assertions.*;

class AddElementTest {

    @Test
    void shouldAddElementAtFirstAndLastPositions(){
        LinkedList<Character> list = new LinkedList<>();
        list.add('e');
        list.add('e');
        list.add('k');

        LinkedList<Character> expectedResult =new LinkedList<>();
        expectedResult.add('G');
        expectedResult.add('e');
        expectedResult.add('e');
        expectedResult.add('k');
        expectedResult.add('s');

        LinkedList<Character> actualResult = addElementAtFirstAndLastPosition(list, 'G', 's');

        assertEquals(expectedResult,actualResult);



    }

}