package ListExamples;

import java.util.LinkedList;

public class AddElement {

    public static LinkedList<Character> addElementAtFirstAndLastPosition(LinkedList<Character> list, Character a, Character b){
        list.addFirst(a);
        list.addLast(b);

        return list;
    }
}
