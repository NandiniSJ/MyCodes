package ListExamples;

import java.util.List;
public class ListOfStringToString {

    public static String convertListOfStringToString(List<String> list){

        return String.join(",", list);
    }

    public static void main(String[] args) {
        List<String> list = List.of("Geeks", "ForGeeks", "GeeksForGeeks");

        String string = convertListOfStringToString(list);

        System.out.println(string);
    }

}
