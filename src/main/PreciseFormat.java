package main;

import java.util.Scanner;

public class PreciseFormat {

    public static void printPreciseFormat(float a, float b){
        float result = a/b;
        System.out.print(result);
        System.out.format(" %.3 f",result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        printPreciseFormat(a,b);
    }
}
