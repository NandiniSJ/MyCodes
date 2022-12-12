package String;

public class StringPangram {

    public static String isStringPangram(String string){
        String string1 = string.toLowerCase();
        char [] frequencyArray = {'a','b','c','d','e','f','g','h','i','j','k','l',
                'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] array = string1.toCharArray();
        for (int i = 0; i < frequencyArray.length; i++) {
            int j =0;
            for(; j< array.length; j++){
                if(array[j]==frequencyArray[i]){
                    break;
                }
            }
            if(j==array.length){
                return "No";
            }
        }
        return "Yes";
    }
}
