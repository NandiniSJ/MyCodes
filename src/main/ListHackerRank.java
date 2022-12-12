package main;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ListHackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int sizeOfList = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<numbers.size(); i++){
            numbers.add(scanner.nextInt());
        }
        int numOfQueries = scanner.nextInt();
        for(int i=0; i<numOfQueries; i++){
            numbers.add(scanner.nextInt(), scanner.nextInt());
            numbers.remove(scanner.nextInt());
        }

        System.out.println(numbers);
    }
}
