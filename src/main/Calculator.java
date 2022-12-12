package main;

import java.util.Scanner;

public class Calculator {

    public int add(int n1, int n2){
        return n1+n2;
    }

    public int subtract(int n1, int n2){
        return n1-n2;
    }

    public static void main(String[] args) {
//        String quastion = "which is our national animal?";
//        String choiceone = "Elephant";
//        String choicetwo = "lion";
//        String choicethree = "Tiger";
//        String exit = "Exit";
//
//        Scanner input = new Scanner (System.in);
//        int i = 1;
//        for(i = 1; i<=3; i=i+1) {
//            String correctAnswer = choicethree;
//
//            System.out.println(quastion);
//            System.out.println(choiceone);
//            System.out.println(choicetwo);
//            System.out.println(choicethree);
//
//            String inputtedAns = input.next();
//
//
//            if (inputtedAns.equalsIgnoreCase(correctAnswer)) {
//                System.out.println("Congratulations");
//            } else {
//                System.out.println("Answer is not correct");
//            }
//        }
        Calculator calculator = new Calculator();
        Scanner input = new Scanner (System.in);

        System.out.println("Enter two numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println("Sum:" + calculator.add(n1, n2));
        System.out.println("Difference:" + calculator.subtract(n1, n2));
    }
}