package ListExamples;

import java.util.List;
import java.util.ArrayList;

public class RemoveDuplicate {

    public static List<Integer> removeDuplicatesFormArrayLit(List<Integer> list){
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(!newList.contains(list.get(i))){
                newList.add(list.get(i));
            }
        }

        return newList;
    }
}
