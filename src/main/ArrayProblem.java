package main;

import java.util.Scanner;

public class ArrayProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an Array ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for(int i = 0 ; i<arraySize ; i++) {
            array[i] = scanner.nextInt();

        }

        for(int j=0; j<arraySize ; j++){
            System.out.println(array[j]);
        }
    }
}
