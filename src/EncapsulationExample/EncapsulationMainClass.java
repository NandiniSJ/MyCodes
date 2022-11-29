package EncapsulationExample;

public class EncapsulationMainClass {

    public static void main(String[] args) {
        EncapsulationStudent student1 = new EncapsulationStudent();

        student1.setName("Nandini");
        student1.setAge(25);
        student1.setRollNum(19);
        student1.setGPA(3.45);


        System.out.println("Name of the student1 is " + student1.getName());
        System.out.println("Age of the student1 is " + student1.getAge());
        System.out.println("RollNum of the student1 is " + student1.getRollNum());
        System.out.println("GPA of student1 is " + student1.getGPA());
    }
}
