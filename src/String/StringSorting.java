package String;
import java.util.Arrays;
public class StringSorting {

    public static String sortAString(String string){
        char [] stringArray = string.toCharArray();
        Arrays.sort(stringArray);

        return new String(stringArray);

    }

    public static void main(String[] args) {
        String string = "nandini";
        String result = sortAString(string);
        System.out.println(result);
    }
}
