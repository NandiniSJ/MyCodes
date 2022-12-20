package ListExamples;
import java.util.ArrayList;
import java.util.List;
public class RemoveASublist {

   // public static void removeASublistForAList(List<Integer> list, int n, int m){

        //list.subList(n,m).clear();
        //System.out.println(list);

   // }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        int fromIndex = 2;
        int endIndex = 4;

        list.subList(fromIndex,endIndex).clear();
        System.out.println(list);
        //removeASublistForAList(list,fromIndex,endIndex);

    }
}
