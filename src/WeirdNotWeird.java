import java.util.Scanner;

public class WeirdNotWeird {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter an integer between 1 to 100, enter -1 to exit");
            int number = scanner.nextInt();
            if( number == -1){
                System.out.println("Thanks for the time. Exiting the application");
                break;
            }
            if(number >100){
                System.out.println("invalid input, please enter number between 1 to 100");
                continue;
            }

            if (number % 2 != 0) {
                System.out.println("Weird");
            } else if (number >= 2 && number <= 5) {
                System.out.println("Not weird");
            } else if (number >= 6 && number <= 20) {
                System.out.println("Weird");
            } else if (number > 20) {
                System.out.println("Not weird");
            }
        }
        scanner.close();
    }
}
