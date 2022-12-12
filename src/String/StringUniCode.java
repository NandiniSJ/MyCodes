package String;

public class StringUniCode {

    public static void main(String[] args) {
        String string = "NANDINI";

        int unicode1 = string.codePointAt(0);
        int unicode2 = string.codePointAt(1);
        int unicode3 = string.codePointAt(2);
        int unicode4 = string.codePointAt(3);
        int unicode5 = string.codePointAt(4);
        int unicode6 = string.codePointAt(5);
        int unicode7 = string.codePointAt(6);

        System.out.println("unicode point at 0 " + unicode1);
        System.out.println("unicode point at 1 " + unicode2);
        System.out.println("unicode point at 2 " + unicode3);
        System.out.println("unicode point at 3 " + unicode4);
        System.out.println("unicode point at 4 " + unicode5);
        System.out.println("unicode point at 5 " + unicode6);
        System.out.println("unicode point at 6 " + unicode7);


    }
}
