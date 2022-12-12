package twoDArray;

public class NormalAndTraceOfMatrix {

    public static double findNormal(int [][] array, int rowSize, int colSize){
        double sumOfElements = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                sumOfElements = sumOfElements + array[i][j] * array[i][j];
                }

        }
        return Math.sqrt(sumOfElements);
    }

    public static int findTrace (int [][] array, int rowSize, int colSize){
        int trace = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if(i == j){
                    trace = trace + array[i][j];
                }
            }
        }
        return trace;
    }
}
