package main.InterfaceExample;

import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic {

    public int divisorSum(int n){
        int result = 0;
        for (int i =1 ; i <= n; i++) {
            if(n%i==0){
                result = result + i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("I implemented: AdvancedArithmetic");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        MyCalculator calculator = new MyCalculator();
        System.out.println(calculator.divisorSum(n));
    }
}
