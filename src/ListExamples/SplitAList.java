package ListExamples;

import java.util.List;
import java.util.ArrayList;

public class SplitAList {

    public static List<List<Integer>> splitAListInTwoHalves(List<Integer> list){
        List<Integer> first = new ArrayList<>(list.subList(0, (list.size())/2));
        List<Integer> second = new ArrayList<>(list.subList((list.size()/2), list.size()));

       return List.of(first,second);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        System.out.println(splitAListInTwoHalves(list));
    }
}
