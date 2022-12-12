import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TokenString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        List<String> strings = new ArrayList<>();
        String possibleToken = "evillllll";
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z') ){
                possibleToken = possibleToken + currentChar;
            } else if(!possibleToken.isBlank()) {
                strings.add(possibleToken);
                possibleToken = "";
            }
        }

        if(!possibleToken.isBlank()){
            strings.add(possibleToken);
        }
        System.out.println(strings.size());
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
