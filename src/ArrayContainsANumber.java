import java.util.ArrayList;
import java.util.List;

public class ArrayContainsANumber {

    public static boolean ifContainsANumber(int[] arr, int n, int x){
       boolean result = false;
        for (int i = 0; i <n ; i++) {
            if (arr[i] == x) {
                result = true;
                break;
            }
        }

        return result;

    /*public static boolean ifContainsANumber(List<Integer> numbers, int a){
         return numbers.contains(a);
    }

    public static void main(String[] args) {
        /*List<Integer> arrayList;
       arrayList = List.of(1,2,5,7,6,3,9);
       int a = 7;
       System.out.println("Is " + a + "present in the array " + ifContainsANumber(arrayList, a));
       */
    }

    public static void main(String[] args) {
        int [] array ={1,5,3,7,6,4,9};
        int x = 8;
        int n = array.length;

        //System.out.println(ifContainsANumber(array,n,x));
        System.out.println(" Is " + x + " present in the array " + ifContainsANumber(array, n, x));
    }

}
