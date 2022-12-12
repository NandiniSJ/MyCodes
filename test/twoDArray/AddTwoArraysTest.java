package twoDArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static twoDArray.AddTwoArrays.addTwoArrays;

class AddTwoArraysTest {

    @Test
    void shouldAddTwoDArrays(){
        int [][] array1 = {{1,2},{3,4}};
        int [][] array2 = {{3,2},{4,6}};

        int[][] actualResult = addTwoArrays(array1,array2,2,2);

        int[][] expectedResult = {{4,4}, {7, 10}};
        for (int i = 0; i < 2; i++) {
            assertArrayEquals(expectedResult[i], actualResult[i]);
        }
    }

}