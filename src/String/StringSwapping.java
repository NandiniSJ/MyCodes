package String;

public class StringSwapping {

    public static String swapPairOfCharactersOfAString(String string){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length()-1; i= i+2) {
            result.append(string.charAt(i + 1)).append(string.charAt(i));
            }
        if(string.length() != result.length()){
            result.append(string.charAt(string.length()-1));
        }
        return result.toString();

    }
}
