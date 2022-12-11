package Arrays.sortExample;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortingReverse {

    public static void main(String[] args) {
        Integer [] array = {1,3,4,9,6,7,8,2,15,16,18,20};
        Arrays.sort(array, Collections.reverseOrder());

        System.out.println(Arrays.toString(array));
    }
}
