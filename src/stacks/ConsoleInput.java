package stacks;

import java.util.Scanner;

public class ConsoleInput implements Input {
    Scanner scanner;

    public ConsoleInput() {
        this.scanner =new Scanner(System.in);
    }


    public int getNextInt(){
        return scanner.nextInt();

    }
}
