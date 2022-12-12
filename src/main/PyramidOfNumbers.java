package main;

public class PyramidOfNumbers {

    public static void FormAPyramid(int n){
        for(int i=0; i<n; i++){

            for(int j=0; j<(2*n); j++){
                if(j>=(n-i) && j<=(n+i)){
                System.out.print("*");
                }else{
                    System.out.print(" ");
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
