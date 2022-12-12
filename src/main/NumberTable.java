package main;

import java.util.Scanner;

public class NumberTable {

    public static void main(String[] args) {
        int N ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 2 and 20");
        N = input.nextInt();
        for (int i=1; i<=10; i++){
            int result = N * i;
            System.out.println(N + " x " + i + " = "+ result);
        }

    }
}
