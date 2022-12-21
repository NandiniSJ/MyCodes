package stacks;

public class Stack {

    private final Input input;

    private final Output output;

    private final int maxSize = 5;
    private final int[] Stack;
    private int top = -1;

    public Stack(Input input, Output output) {
        this.input = input;
        this.output = output;
        this.Stack = new int[maxSize];
    }

    public void push() {
        if (top == maxSize - 1) {
            output.display("Stack is Full");
        } else {
            output.display("Enter the element to be added");
            int element = input.getNextInt();
            top++;
            Stack[top] = element;
        }
    }

    public void pop() {
        if (top == -1) {
            output.display("Stack is empty");
        } else {
            int k = Stack[top];
            output.display("element to be deleted: " + k);
            top = top - 1;
        }
    }

    public void peek() {
        if (top == -1) {
            output.display("stack is empty");
        } else {
            output.display("" + Stack[top]);
        }
    }

    public void display() {
        if (top == -1) {
            output.display("stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                output.display("" + Stack[i]);
            }
        }
    }

    public void start() {

        stacks.Stack stack = new Stack(input, output);
        while (true) {
            try {
                output.displayChoices();
                int choice = input.getNextInt();

                switch (choice) {
                    case 1:
                        stack.push();
                        break;
                    case 2:
                        stack.pop();
                        break;
                    case 3:
                        stack.peek();
                        break;
                    case 4:
                        stack.display();
                        break;
                    case 5:
                        output.display("Exit");
                        return;
                }
            } catch (Exception e) {
                output.display(e.getMessage());
            }
        }

    }

    public int getTop() {
        return top;
    }

    public int[] getStack() {
        return Stack;
    }
}
