import java.util.Scanner;

public class ArrayGame {

    public static boolean canWin(int leap, int[] game, int index) {
        if(index >= game.length ||
                index + 1 >= game.length ||
                index + leap >= game.length){
            return true;
        }

        if(game[index+1] == 0){
            index = index + 1;
            boolean result =canWin(leap, game, index);
            if(result) return true;
        }
        if(game[index + leap] == 0){
            index = index + leap;
            boolean result =canWin(leap, game, index);
            if(result) return true;
        }
        if(index-1 >= 0 && game[index-1]==0 && (game[index-1+leap] == 0 || index-1 + leap >= game.length)){
            index =index-1 + leap;
            boolean result =canWin(leap, game, index);
            if(result) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
