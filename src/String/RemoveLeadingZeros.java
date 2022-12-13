package String;

public class RemoveLeadingZeros {

    public static String removeLeadingZeros(String string){
       /* StringBuilder newString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != '0'){
                //newString.append(string.charAt(i));
                newString= string.replaceAll(i,i,"");

            }

        }*/

        return string.replaceAll("0","");
        //return newString.toString();
    }
}
