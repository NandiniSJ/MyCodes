import java.util.Scanner;

public class PerimeterOfRectangle {

    public static int findPerimeter (int length, int width){
        int perimeter = 2 * length + 2 * width ;
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        System.out.println(findPerimeter(length, width));
    }
}
