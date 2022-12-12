package main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
    //    boolean isLeapYear = false;

        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(findLeapYear(year));
       // if (year % 4 == 0) {
         //   isLeapYear = true;
           // System.out.println("The given year is a leap year");
        //} else {
          //  System.out.println("The given year is not a lear year");
    }


    public static boolean findLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
