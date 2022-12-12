package main;

import java.util.Scanner;

public class GeekBinaryNumbers {

    public static String add(String x, String y) {
        int carry = 0;
        String result = "";

        if(x.length() > y.length()){
            for(int i = 0; i<=(x.length()-y.length()); i++ ){
                y = "0" + y;
            }
        }
        if(y.length()>x.length()){
            for(int i=0; i<=(y.length()-x.length()); i++){
                x = "0" + x;
            }
        }
        for (int i = x.length()-1, j = y.length()-1; i >= 0 && j >= 0; i--, j--) {
            int a = Integer.parseInt("" + x.charAt(i));
            int b = Integer.parseInt("" + y.charAt(j));
            int sum = a + b + carry;
            if (sum == 2) {
                result = "0" + result;
                carry = 1;
            } else if (sum == 1) {
                result = "1" + result;
            } else if (sum == 3) {
                result = "1" + result;
                carry = 1;
            } else {
                result = "0" + result;
            }
        }
        return carry == 1? carry + result : result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two binary numbers: ");
        String X = scanner.next();
        String Y = scanner.next();
        System.out.println(add(X,Y));
    }
}
