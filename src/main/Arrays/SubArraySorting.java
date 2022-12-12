package main.Arrays;
import java.util.Arrays;
import java.util.Collections;
public class SubArraySorting {
    public static void main(String[] args) {
        Integer [] array = {10,30,45,62,75,39,14,26,95};
        Arrays.sort(array,1,7, Collections.reverseOrder());

        System.out.println(Arrays.toString(array));
    }

}
