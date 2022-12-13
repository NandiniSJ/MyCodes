package String;

public class InsertAString {

    public static String InsertAStringIntoAnotherString(String string,String stringToBeInserted, int index){
        StringBuilder newString =new StringBuilder();
        /*for (int i = 0; i <=index; i++) {
            newString.append(string.charAt(i));
        }
        newString.append(stringToBeInserted);
        for(int i= index+1; i<string.length(); i++){
            newString.append(string.charAt(i));
        }*/

        newString.append(string, 0, index+1);
        newString.append(stringToBeInserted);
        newString.append(string.substring(index+1));

        return newString.toString();
    }
}
