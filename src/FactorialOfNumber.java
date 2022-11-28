import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorialOfNumber {

    public static int  findFactorialOfANumber (int x){
        int factorialNum = x;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<x ; i++){
            numbers.add(x-i);
        }
        numbers.add(1);
        for (int j=0; j<numbers.size(); j++){
            factorialNum = factorialNum * numbers.get(j);
        }
//        factorialNum = 1;
//        for (int i = x; i > 0; i--) {
//            factorialNum = factorialNum * i;
//        }
     return factorialNum;
    }

    /*static int fact(int number){
        if(number == 1){
            return 1;
        }
        return number * fact(number-1);
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println(findFactorialOfANumber(number));

    }

}
