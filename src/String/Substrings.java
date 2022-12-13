package String;

import java.util.ArrayList;
import java.util.List;

public class Substrings {

    public static List<String> findNumberOfSubstrings(String string){
        List<String> substringList = new ArrayList<>();
        int length = string.length();
        for (int i = 0; i < length; i++) {
            for(int j=i+1; j<=length; j++){
                substringList.add(string.substring(i,j));
            }
        }

        return substringList;
    }

    public static void main(String[] args) {
        String string = "The Cat";
        List<String> numberOfSubstrings = findNumberOfSubstrings(string);
        System.out.println(numberOfSubstrings);

        System.out.println(numberOfSubstrings.size());
    }
}
