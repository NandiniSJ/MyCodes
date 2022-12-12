package twoDArray;

public class TransposeOfMatrix {

    public static int[][] findTransposeOfMatrix (int [][]array, int rowSize, int colSize){
        int [][] transposeMatrix = new int [rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
               transposeMatrix[i][j] =  array[j][i];
            }

        }
        return transposeMatrix;
    }
}
