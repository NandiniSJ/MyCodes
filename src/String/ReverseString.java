package String;

public class ReverseString {
       public static String findReverseString(String string){
       //String newString = "";
       StringBuilder reverseString = new StringBuilder();
        for(int i=string.length()-1; i>=0; i--){
           // newString = newString + "" + string.charAt(i);
            reverseString.append(string.charAt(i));
        }

        return reverseString.toString();
    }
}
