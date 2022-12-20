package ListExamples;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static ListExamples.RemoveDuplicate.removeDuplicatesFormArrayLit;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {

    @Test
    void shouldRemoveDuplicatesFromArrayList(){
        List<Integer> list = List.of(1,2,2,3,4,5,5,6,7,8,8);

        List<Integer> expectedResult = List.of(1,2,3,4,5,6,7,8);

        List<Integer> actualResult = removeDuplicatesFormArrayLit(list);

        assertEquals(expectedResult,actualResult);
    }

}