package stacks;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(new ConsoleInput(), new ConsoleOutput());
        stack.start();
    }
}
