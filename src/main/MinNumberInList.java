package main;

import java.util.Comparator;
import java.util.List;


public class MinNumberInList {

    public static int findMinNumber(List<Integer> numbers){
        int minNum = numbers.get(0);
        for(int i = 0; i< numbers.size(); i++){
            if(minNum > numbers.get(i)){
                minNum = numbers.get(i);
            }
        }
        return minNum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,-1,2,4,3,5);
        System.out.println(findMinNumber(numbers));

        int result = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(result);
    }
}
