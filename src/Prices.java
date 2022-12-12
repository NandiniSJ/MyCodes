import java.util.Scanner;

public class Prices {

    public static void main(String[] args) {
        double[] [] prices = new double[4][2];
        Scanner originalAmount = new Scanner(System.in);

        for( int i=0; i<4; i++)
        {
            System.out.println("Enter the original prices");
            prices[i][0] = originalAmount.nextDouble();
            prices[i][1] = prices[i][0] * 0.7;
        }
        for (int i=0; i<4; i++)
        {
            System.out.println("Original prices " + prices[i][0] + "\tDiscounted prices" + prices[i][1]);
        }
    }
}
