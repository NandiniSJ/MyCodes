package twoDArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static twoDArray.sortingTwoDArray.sortTwoDArrayCol;

class sortingTwoDArrayTest {

    @Test
    void shouldSortTwoDArray(){

        int[][] array = {{1,2,3,4},{3,6,7,2},{6,8,2,4},{3,4,1,9}};
        int n = 3;

        int [][] actualResult = sortTwoDArrayCol(array,4,4,3);

            int [][] expectedResult = {{1,2,1,4},{3,6,2,2},{6,8,3,4},{3,4,7,9}};

        for (int i = 0; i < 4; i++) {
            assertArrayEquals(expectedResult[i],actualResult[i]);

        }

    }

}