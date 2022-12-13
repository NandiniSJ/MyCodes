package String;

public class CompareTwoStrings {

    public static int compareTwoStrings(String string1, String string2){
        int l1 = string1.length();
        int l2 = string2.length();
        int lMin = Math.min(l1,l2);

        for (int i = 0; i < lMin; i++) {
            if(string1.charAt(i) != string2.charAt(i)){
                return (int)string1.charAt(i) - (int)string2.charAt(i);
            }
        }
        if(l1 != l2){
            return l1 -l2;
        }else{
            return 0;
        }
    }
}
