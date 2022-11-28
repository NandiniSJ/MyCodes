import java.util.Scanner;

public class OddEvenFinder {

    public static String findOddEven (int number) {
       String result;
       if(number% 2 ==0) {
           result = "Even";
        } else{
           result = "Odd";
        }
       return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number =input.nextInt();

        String result = findOddEven(number);

        System.out.println(result);
    }
}
