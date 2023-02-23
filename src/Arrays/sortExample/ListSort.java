package Arrays.sortExample;

import java.util.Arrays;
import java.util.Scanner;

public class ListSort {

    public int[] sortArray(int[] array){
        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                count0++;
            }else count1++;
        }
        int [] countArray = new int[array.length];
        for (int i = 0; i <count0; i++) {
            countArray[i] = 0;
        }
        for (int i =count0 ; i < array.length; i++) {
            countArray [i] = 1;
        }
        return countArray;

    }

    public static void main(String[] args) {
       ListSort listSort = new ListSort();
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        int [] array = new int[input];
//        for(int i = 0; i < array.length; i++){
//            array[i] = scanner.nextInt();
//        }
        int[] array = {0,1,1,0,1,1,0,0,0};

        System.out.println(Arrays.toString(listSort.sortArray(array)));
    }


}
