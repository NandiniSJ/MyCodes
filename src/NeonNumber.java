import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        findNeonNum(X);

    }

    public static void findNeonNum(int X){
        String squareOfNum = ""+ (X * X);
        char[] numbers = squareOfNum.toCharArray();
        int addOfDigits =0;

        for(int i=0; i<numbers.length; i++){
            addOfDigits =addOfDigits + Integer.parseInt(""+ numbers[i]);

        }
        if(X == addOfDigits){
            System.out.println("Neon number");
        }else{
            System.out.println("Not a Neon NUmber");
        }

    }
}
