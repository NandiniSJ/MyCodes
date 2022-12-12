package main;

public class MirrorLowerStarTriangle {

    public static void FormMirrorTriangle(int n){
        for(int i=n; i>0; i--){
            int spaces = n-i;
            for(int j=0; j<(n-i); j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0; i<=n; i++){
            int spaces = n-i;
          for(int j=0; j<(n-i); j++){
              System.out.print(" ");
          }
          for(int k=0; k<=i; k++){
              System.out.print("* ");
          }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int n=7;
        FormMirrorTriangle(n);

    }
}
