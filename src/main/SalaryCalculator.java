package main;

import java.util.Scanner;

public class SalaryCalculator {

    public static double calculate(double hoursPerWeek, double salaryPerHour){
        double salaryPerWeek = hoursPerWeek * salaryPerHour;
        double grossSalary = 52 * salaryPerWeek;
        return grossSalary;
    }

    public static void main(String[] args) {
        System.out.println("Enter Hours per week");
        Scanner input = new Scanner(System.in);
        double hoursPerWeek = input.nextDouble();
        System.out.println("Enter Salary per hour");
        double salaryPerHour = input.nextDouble();


        double grossSalary = calculate(hoursPerWeek, salaryPerHour);
        System.out.println(grossSalary);
    }

}
