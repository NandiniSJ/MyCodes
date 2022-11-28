public class SquareStarPattern {

    public static void squareStar(int h, int b) {
        for (int i = 0; i < b; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < h - 2; i++) {
            for (int j = 0; j < b; j++) {
                if (j == 0) {
                    System.out.print("* ");
                }if(j==b-1) {
                    System.out.print(" *");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < b; i++) {
            System.out.print("* ");

        }
    }

    public static void main(String[] args) {
        int h = 4;
        int b = 4;
        squareStar(h,b);
    }
}
