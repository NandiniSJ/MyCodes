package String;

public class CompareTwoStringReturnBoolean {

    public static void main(String[] args) {
        String string1 = "Geeks";
        String string2 = "Geeks";
        String string3 = "GeeksForGeeks";
        String string4 = "Practice";

        System.out.println("Comparing " + string1 + " and " + string2 + ": "+  string1.equals(string2));
        System.out.println("Comparing " + string3 + " and " + string4 + ": "+  string3.equals(string4));
        System.out.println("Comparing " + string2 + " and " + string3 + ": "+  string2.equals(string3));
        System.out.println("Comparing " + string1 + " and " + string4 + ": "+  string1.equals(string4));
    }

}
