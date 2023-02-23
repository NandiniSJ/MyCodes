package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hashset {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();

            Set<String> arraySet = new HashSet<>();

            for (int i = 0; i < t; i++) {
               arraySet.add(s.next() + "#"+ s.next());
                System.out.println(arraySet.size());
            }

        }

}
