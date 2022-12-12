import java.util.Scanner;

public class StringOperation {
    static String isLexiographicallyGreater(String A, String B){

        for(int i =0; i< A.length() && i< B.length(); i++){
            if(A.charAt(i) > B.charAt(i) ) {
                return "Yes";
            }

            if(A.charAt(i) == B.charAt(i)){
                continue;
            } else {
                return "No";
            }
        }

        if(A.length() > B.length()){
            return "Yes";
        } else {
            return "No";
        }

    }
    //'A' --> "A"

    static String capitalizeFirstLetter(String string){
        return ("" + string.charAt(0)).toUpperCase() + string.substring(1);
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(isLexiographicallyGreater(A, B));
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));


    }

}
