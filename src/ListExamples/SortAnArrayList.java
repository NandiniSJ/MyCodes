package ListExamples;

import java.util.*;

public class SortAnArrayList {

    public static ArrayList<Integer> sortAnArrayListInAscendingOrder(ArrayList<Integer> list){

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(3,4,6,2,1,6,9,7,5));
        ArrayList<Integer> sortedList = sortAnArrayListInAscendingOrder(list);

        System.out.println(sortedList);
    }

    public static ArrayList<String> sortAnArrayListInAscendingOrderString(ArrayList<String> list){

        Collections.sort(list);

        return list;
    }

}
