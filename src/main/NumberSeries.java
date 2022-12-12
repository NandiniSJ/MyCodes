package main;

import java.util.Scanner;
public class NumberSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for(int i=0; i<q; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int sj = a;
            for(int j=0; j<n; j++){
                sj= (int) (sj +Math.pow(2,j) * b);
                System.out.print(sj + " ");
            }
            System.out.println();
        }


    }
}
