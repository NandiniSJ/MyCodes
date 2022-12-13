package String;

import java.util.List;
import java.util.ArrayList;

public class PrintEvenLengthWords {

    public static List<String> printEvenLengthWords(String string){
        String[] array = string.split(" ");
        List<String> eveLengthWord = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() %2 ==0){
                eveLengthWord.add(array[i]);
            }

        }
       return eveLengthWord;
    }
}
