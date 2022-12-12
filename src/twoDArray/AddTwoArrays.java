package twoDArray;

import java.util.Arrays;

public class AddTwoArrays {

    public static void printMatrix(int[][] array, int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static int[][] addTwoArrays(int[][] array1, int[][] array2, int rowSize, int colSize) {
        int[][] sum = new int[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{3, 2}, {4, 6}};

        System.out.println("Array1 is");
        printMatrix(array1, 2, 2);

        System.out.println("Array2 is");
        printMatrix(array2, 2, 2);

        System.out.println("Sum of Two Arrays : ");
        int[][] sum = addTwoArrays(array1, array2, 2, 2);
        for (int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(sum[i]));
        }
    }
}
