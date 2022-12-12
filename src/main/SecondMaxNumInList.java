package main;

import java.util.List;
public class SecondMaxNumInList {

    public static int findSecondMaxNum(List<Integer> numbers) {
        int firstMax = Math.max(numbers.get(0), numbers.get(1));
        int secondMax = Math.min(numbers.get(0),numbers.get(1));

        for(int i=2; i<numbers.size(); i++){
            if(numbers.get(i)>firstMax){
                secondMax=firstMax;
                firstMax=numbers.get(i);
            }else if(numbers.get(i)>secondMax){
                secondMax=numbers.get(i);
            }
        }
        return secondMax;

    }

    public static void main(String[] args) {
        List<Integer> numbers =List.of(1,3,2);
        System.out.println(findSecondMaxNum(numbers));
    }

}