package ListExamples;

import org.junit.jupiter.api.Test;

import java.util.List;

import static ListExamples.SplitAList.splitAListInTwoHalves;
import static org.junit.jupiter.api.Assertions.*;

class SplitAListTest {

    @Test
    void shouldSplitAListInTwoHalves(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        List<List<Integer>> expectedResult =List.of(List.of(1, 2, 3, 4),List.of(5, 6, 7, 8));

        List<List<Integer>> actualResult = splitAListInTwoHalves(list);

        assertEquals(expectedResult,actualResult);
    }

}