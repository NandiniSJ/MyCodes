package Arrays.sortExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArray {

    public int subArray(int[] array){
        int count = 0;
        List<List<Integer>> subArr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <array.length ; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    list.add(array[k]);
                }
               if(sum(list) < 0 ){
                   subArr.add(list);
                   count ++;
               }
            }
        }
        return count;
    }

    public int sum(List<Integer> list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int [] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = scanner.nextInt();
        }
        SubArray subArray = new SubArray();
        System.out.println(subArray.subArray(array));

    }

}
