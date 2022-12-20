package ListExamples;

import java.util.*;

public class StringToListOfCharacters {

    public static List<Character> convertStringToListOfCharacters(String string){
      List<Character> list = new ArrayList<>();

        for(int i=0; i<string.length(); i++){
            list.add(string.charAt(i));
        }

        return list;
    }

    public static void main(String[] args) {
        String string = "NANDINISHILUJADHAV";
        List<Character> newList = convertStringToListOfCharacters(string);
        System.out.println(newList);
    }
}
