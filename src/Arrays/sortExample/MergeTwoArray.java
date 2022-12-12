package Arrays.sortExample;
import java.util.Arrays;
public class MergeTwoArray {

    public static int[] mergeTwoArray(int[]array1, int[]array2){
        int n= array1.length+array2.length;
        int[]array3 = new int[n];
        for(int i=0; i<array1.length; i++){
            array3[i]=array1[i];
        }
        for(int j=0; j<array2.length; j++){
            array3[array1.length + j] = array2[j];
        }

        return array3;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};
        System.out.println(Arrays.toString(mergeTwoArray(array1,array2)));
    }
}
