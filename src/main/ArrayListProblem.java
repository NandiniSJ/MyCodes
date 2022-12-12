package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListProblem {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfArrayList = Integer.parseInt(bufferedReader.readLine().trim());
        List<List<Integer>>listOfList = new ArrayList<>();
        for(int i=0; i<numOfArrayList; i++){
            List<Integer> Ai = new ArrayList<>();

            String nextLine = bufferedReader.readLine().trim();
            String[] numbers = nextLine.split(" ");

            for(int j=0; j<numbers.length; j++){
                if(!numbers[j].equals("")) {
                    Ai.add(Integer.parseInt(numbers[j]));
                }
            }
            listOfList.add(Ai);
        }
        int NumOfQueries = Integer.parseInt(bufferedReader.readLine());

        for(int i=0; i<NumOfQueries; i++) {
            String nextLine = bufferedReader.readLine().trim();
            String[] numbers = nextLine.split(" ");

            int x = Integer.parseInt(numbers[0]);
            int y = Integer.parseInt(numbers[1]);
            List<Integer> list = listOfList.get(x - 1);
            if ((x - 1) <= listOfList.size()) {
                if (y < list.size()) {
                    System.out.println(list.get(y));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }

    }
}
