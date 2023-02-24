import org.mockito.cglib.core.Local;

import java.util.Scanner;
import java.util.*;
import java.text.*;

class FormatCurrency {

    static Locale us = Locale.US;
    static Locale india = new Locale("EN", "IN");
    static Locale china = Locale.CHINA;
    static Locale france = Locale.FRANCE;


    public static String convertCurrency(double payment, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(payment);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        FormatCurrency formatCurrency = new FormatCurrency();

        System.out.println("US: " + convertCurrency(payment, us));
        System.out.println("India: " + convertCurrency(payment, india));
        System.out.println("China: " + convertCurrency(payment, china));
        System.out.println("France: " + convertCurrency(payment, france));
    }
}

