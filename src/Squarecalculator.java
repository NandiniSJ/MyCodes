import java.util.Scanner;

public class Squarecalculator {

    public static int squareOfANumber(int number) {
        int result = number * number;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int result = squareOfANumber(n1);
        System.out.println(result);
    }
}
