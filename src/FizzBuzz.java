import java.util.Scanner;

public class FizzBuzz {

    public static String findFIzzBuzz(int number) {
        String result = "";
        if(number%3 ==0) {
            result = "fizz";
        }
        if(number%5 ==0) {
            result ="buzz";
        }
        if(number%3 ==0 && number%5 ==0){
            result = "fizzBuzz";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = findFIzzBuzz(number);
        System.out.println(result);

    }
}
