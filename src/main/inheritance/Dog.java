package main.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println("I am barking");
    }
}
