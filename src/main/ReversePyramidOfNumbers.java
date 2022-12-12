package main;

public class ReversePyramidOfNumbers {

    public static void FormAPyramid(int n){
        for(int i=n-1; i>=0; i--){

            for(int j=0; j<(2*n); j++){
                if(j>=(n-i) && j<=(n+i)){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n =5;
        FormAPyramid(n);
    }
}
