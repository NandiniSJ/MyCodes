import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MaxNumberInList {

    //write one function which accept list of integers as parameter and return Max element in the list

    public static int findMAxNumber(List<Integer> numbers){
        int maxNum= numbers.get(0);
       for(int i=0; i<numbers.size(); i++){
           if(numbers.get(i)>maxNum){
               maxNum = numbers.get(i);
           }
       }
       return maxNum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-2,-3,-6,-8,-9,-4);
        System.out.println(findMAxNumber(numbers));
    }
}
