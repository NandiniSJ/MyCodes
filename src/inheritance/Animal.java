package inheritance;

public class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(" I am Eating");
    }

    public void walk(){
        System.out.println("I am walking");
    }

}
