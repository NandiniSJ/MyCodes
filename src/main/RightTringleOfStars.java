package main;

import java.util.Scanner;

public class RightTringleOfStars {

    public static void FormARectangle(int n){
        for(int i = 0; i<n ; i++){
            for( int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int K = scanner.nextInt();
        FormARectangle(K);
    }
}
