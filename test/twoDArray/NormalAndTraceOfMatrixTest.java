package twoDArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static twoDArray.NormalAndTraceOfMatrix.findNormal;
import static twoDArray.NormalAndTraceOfMatrix.findTrace;

class NormalAndTraceOfMatrixTest {

    @Test
    void shouldFindNormal(){
        int[][] array =  {{1, 4, 4}, {2, 3, 7},{0, 5, 1}};

        double expectedResult = 11;
        double actualResult = findNormal(array, 3,3);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldFindTrace(){
        int[][] array =  {{1, 4, 4}, {2, 3, 7},{0, 5, 1}};

        double expectedResult = 5;
        double actualResult = findTrace(array, 3,3);

        assertEquals(expectedResult,actualResult);
    }
}