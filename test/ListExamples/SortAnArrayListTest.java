package ListExamples;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static ListExamples.SortAnArrayList.sortAnArrayListInAscendingOrder;
import static ListExamples.SortAnArrayList.sortAnArrayListInAscendingOrderString;
import static org.junit.jupiter.api.Assertions.*;

class SortAnArrayListTest {

    @Test
    void shouldSortAnArrayListInAscendingOrder(){
        ArrayList<Integer> list = new ArrayList<>(List.of(3,4,6,2,1,6,9,7,5));

        ArrayList<Integer> expectedResult =new ArrayList<> (List.of(1,2,3,4,5,6,6,7,9));

        ArrayList<Integer> actualResult = sortAnArrayListInAscendingOrder(list);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldSortAnArrayListInAscendingOrderString(){
        ArrayList<String> list = new ArrayList<>(List.of("Geeks", "For", "ForGeeks", "GeeksForGeeks", "A computer portal"));

        ArrayList<String> expectedResult =new ArrayList<> (List.of("A computer portal", "For", "ForGeeks", "Geeks", "GeeksForGeeks"));

        ArrayList<String> actualResult = sortAnArrayListInAscendingOrderString(list);

        assertEquals(expectedResult,actualResult);
    }

}