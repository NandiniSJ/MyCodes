package Arrays.sortExample;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class CommonElementOfTwoArrays {

    public static void findCommonElement(List<String> list1, List<String> list2){
        Set<String> result = new HashSet<>();
        for(int i=0; i< list1.size(); i++){
            for(int j=0; j< list2.size(); j++){
                if(list1.get(i).equals(list2.get(j))){
                    result.add(list1.get(i));
                    break;
                }
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        List<String> list1 =List.of("a", "b", "c");
        List<String> list2 = List.of("a", "e","c", "d");
        findCommonElement(list1,list2);
    }
}
