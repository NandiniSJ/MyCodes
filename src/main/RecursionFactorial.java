package main;

import java.util.Scanner;

public class RecursionFactorial {

    public int findFactorialOfNum(int n){
        if(n<=1){
            return 1;
        }

        return n * findFactorialOfNum(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        RecursionFactorial recursionFactorial = new RecursionFactorial();
        System.out.println(recursionFactorial.findFactorialOfNum(number));
    }
}
