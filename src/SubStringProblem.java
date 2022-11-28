import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SubStringProblem {

    public static String getSmallestAndLargest( String string, int length){
        List<String> substrings = new ArrayList<>();
        for(int i=0; i<string.length()-length+1; i++){
           substrings.add(string.substring(i, i+length));
        }
        String smallest = substrings.get(0);
        String largest = substrings.get(0);

        for (int i = 0; i < substrings.size(); i++) {
            String currentString = substrings.get(i);
            if(currentString.compareTo(smallest) < 0){
                smallest = currentString;
            } else if(currentString.compareTo(largest) > 0){
                largest = currentString;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int length = scanner.nextInt();

        System.out.println(getSmallestAndLargest(string,length));
    }
}
