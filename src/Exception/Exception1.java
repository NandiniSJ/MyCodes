package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exception1 {

    public static int divideByZero(){
        Scanner scanner = new Scanner(System.in);
        int numer = scanner.nextInt();
        int deno = scanner.nextInt();
        try {
            return numer/deno;
        } catch (ArithmeticException e) {
           System.out.println("Invalid deno, please enter numbers again");
           return divideByZero();
        }
    }

    public static int computeDivision(){

        int result = 0;

        try{
            result = divideByZero();
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

        return result;
    }

    public static void main(String[] args) {
        int a= 10;
        int b= 0;

        try{
           int i = computeDivision();
            System.out.println(i);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
