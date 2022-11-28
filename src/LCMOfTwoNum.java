import java.util.Scanner;

public class LCMOfTwoNum {

    public static int findLcmOfTwoNum(int x, int y){
        int XY = (x * y) ;
        int a = Math.min(x, y);
        int LCM = 0 ;

        for(int i=a; i>=1; i--){
        if(x%i == 0 && y%i ==0){
            return (x * y) / i ;
        }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(findLcmOfTwoNum(number1, number2));


    }
}
