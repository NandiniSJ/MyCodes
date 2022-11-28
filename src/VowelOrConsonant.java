import java.util.List;
import java.util.Scanner;

public class VowelOrConsonant {

    public static String checkVowelOrConsonant(char x){
        List<Character> characters = List.of('a','e','i','o','u');
        if(characters.contains(x)){
            return "Vowel";
        }
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = scanner.next().charAt(0);
        System.out.println(checkVowelOrConsonant(character));
    }
}
