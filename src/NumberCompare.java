import java.lang.Integer;
public class NumberCompare {

    public static void main(String[] args){
        int a = 30;
        int b = 30;

        System.out.println(Integer.compare(a,b));

        int x = 30;
        int y = 20;

        System.out.println(Integer.compare(x,y));

        int u = 20;
        int v = 30;

        System.out.println(Integer.compare(u,v));

    }

    /*public static int compare(int a, int b){
        int difference = a - b;

        if (difference ==0){
            return 0;
        }else if(difference < 0){
            return -1;
        }else{
            return 1;
        }
    }*/
}
