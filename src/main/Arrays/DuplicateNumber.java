package main.Arrays;

import java.util.Arrays;

public class DuplicateNumber{

    public static int[] removeDuplicateNum(int[]array, int n){
        int[] result = new int[n];
        for(int i = 0, j=0; i<array.length; i++){
            if(i > 0 && result[j-1] == array[i]){
                continue;
            }
            result[j] = array[i];
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
     int [] array = {1,2,2,6,7,7,5,3};

        int[] result = removeDuplicateNum(array, 8);
        System.out.println(Arrays.toString(result));

    }

}
