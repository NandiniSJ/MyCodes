package twoDArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static twoDArray.TransposeOfMatrix.findTransposeOfMatrix;
class TransposeOfMatrixTest {

    @Test
    void shouldFindTransposeOfMatrix() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {4, 2, 6}};


        int[][] actualResult = findTransposeOfMatrix(array, 3,3);

        int[][]expectedResult = {{1,4,4},{2,5,2},{3,6,6}};
        for (int i = 0; i < 3; i++) {
            assertArrayEquals(expectedResult[i],actualResult[i]);
        }
    }

}