package Arrays.sortExample;

import java.sql.SQLOutput;

public class ArraysEqualOrNot {

    public static String checkArraysEqualOrNot(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return "No";
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return "No";
            }

        }
        return "Yes";
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 7, 5, 6};
        System.out.println(checkArraysEqualOrNot(array1, array2));
    }
}
