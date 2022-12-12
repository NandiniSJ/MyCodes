package main;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MaxNumberInList {

    //write one function which accept list of integers as parameter and return Max element in the list
        public static int findLargestNum(int[]array){
            int largestNum = array[0];
            for(int i = 0 ; i < array.length ; i++){
                if(array[i]>largestNum){
                    largestNum = array[i];
                }
            }
            return largestNum;
        }

        public static void main(String[] args){
            int [] array = {7,8,6,4,9,3,2,10,46};
            System.out.println(findLargestNum(array));
        }

}
