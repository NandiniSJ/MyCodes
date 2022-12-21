package stacks;

public class ConsoleOutput implements Output {

    public void displayChoices(){
        System.out.println("Select the operation");
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. peek");
        System.out.println("4. display");

    }

    public void display(String string){
        System.out.println(string);
    }
}
