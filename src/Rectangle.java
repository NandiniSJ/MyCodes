import java.util.Scanner;

public class Rectangle {

    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double findArea(){
        return this.length * this.width;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter length of a rectangle");
       double length = scanner.nextDouble();
       System.out.println("Enter width of a rectangle");
       double width = scanner.nextDouble();

       Rectangle rectangle = new Rectangle(length,width);
       double area = rectangle.findArea();
       System.out.println(area);

    }
}
