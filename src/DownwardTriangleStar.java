public class DownwardTriangleStar {

    public static void FormDownwardTriangle(int n){
        for (int i = n; i>0 ; i--) {
            for(int j=i; j>0; j--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        FormDownwardTriangle(n);
    }
}
