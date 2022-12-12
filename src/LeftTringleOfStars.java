import java.util.Scanner;

public class LeftTringleOfStars {

    public static void FormALeftTringle(int n){
        for(int i=0; i<n; i++){
            int spaces = n-i;
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        FormALeftTringle(N);
    }
}
