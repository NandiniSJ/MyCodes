import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringA = scanner.next().toUpperCase();
        String stringB = scanner.next().toUpperCase();

        if(isAnagram(stringA, stringB)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


    }

    public static boolean isAnagram(String stringA, String stringB){
        Map<Character, Integer> characterA = new HashMap<>();
        Map<Character, Integer> characterB = new HashMap<>();

        for(int i=0; i<stringA.length(); i++){
            char currentChar = stringA.charAt(i);
            int currentValue = characterA.getOrDefault(currentChar, 0);
            characterA.put(currentChar, currentValue+1);

//            if(characterA.containsKey(currentChar)){
//                int currentValue = characterA.get(currentChar);
//                characterA.put(currentChar, currentValue+1);
//            }else{
//                characterA.put(currentChar, 1);
//            }
        }

        for(int i=0; i<stringB.length(); i++){
            char currentChar = stringB.charAt(i);

            if(characterB.containsKey(currentChar)){
                int currentValue = characterB.get(currentChar);
                characterB.put(currentChar, currentValue+1);
            }else{
                characterB.put(currentChar, 1);
            }
        }

        return characterA.equals(characterB);

    }

}

