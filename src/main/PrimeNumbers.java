package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(findPrimeNumber(number));

    }

    public static List<Integer> findPrimeNumber(int number) {
        List<Integer> numbers = new ArrayList<>();
       for(int i = 2; i<=number; i++){
           boolean isComposite = false;

           for(int j =2 ; j<i ; j++){
               if(i%j ==0){
                 isComposite = true;
                   break;
               }

           }
          if(!isComposite)
               numbers.add(i);
       }

        return numbers;
    }

}
