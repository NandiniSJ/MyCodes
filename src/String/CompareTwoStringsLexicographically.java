package String;

public class CompareTwoStringsLexicographically {

    public static void main(String[] args) {
        String string1 = "Nandini";
        String string2 = "Shilu";
        String string3 = "Nandini";
        String string4 = "SHILU";

        System.out.println(string1.compareTo(string2));
        System.out.println(string2.compareToIgnoreCase(string4));
        System.out.println(string1.compareTo(string3));
    }
}
