package twoDArray;

import java.util.Arrays;

public class sortingTwoDArray {

    public static int[][] sortTwoDArrayCol(int[][] array,int rowSize, int colSize, int n){
        int [] colValues = new int [rowSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
               if(j == n-1) {
                   colValues[i] = array[i][j];
               }
            }
        }
        Arrays.sort(colValues);

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if(j == n-1) {
                    array[i][j] =  colValues[i] ;
                }
            }
        }

        return array;
    }
}
