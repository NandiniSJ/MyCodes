package ListExamples;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray {

    public static Object[] convertLinkedListToArray(LinkedList<Integer> linkedList){
        Object[] array = linkedList.toArray();

        return array;

    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        Object[] objArray = convertLinkedListToArray(linkedList);

        System.out.println(Arrays.toString(objArray));

    }
}
