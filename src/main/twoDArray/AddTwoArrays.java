package main.twoDArray;

import java.util.Arrays;

public class AddTwoArrays {

    public static int[][] addTwoArrays(int [][]array1, int [][]array2, int rowSize, int colSize){
       int [][] sum = new int [rowSize][colSize];
       for(int i=0; i<rowSize; i++){
           for(int j=0; j<colSize; j++){
               sum[i][j] = array1[i][j] + array2[i][j];
           }
       }
       return sum;
    }

    public static void main(String[] args) {
        int [][] array1 = {{1,2},{3,4}};
        int [][] array2 = {{3,2},{4,6}};

        int[][] sum = addTwoArrays(array1,array2,2,2);
        for(int i=0; i<2; i++){
            System.out.println(Arrays.toString(sum[i]));
        }

    }
}
