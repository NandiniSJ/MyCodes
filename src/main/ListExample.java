package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    //Create main.Student class --> rollNumber, name, marksInPercentage;
    //Create List of students
    //Write one function --> check marksInPercentage, if >= 35 ==> Roll Number : Pass/Fail


}
 class Student{
    String name;
    int rollNUmber;
    double marksInPercentage;

    public Student(String name,int rollNUmber,double marksInPercentage){
        this.name = name;
        this.rollNUmber = rollNUmber;
        this.marksInPercentage = marksInPercentage;

    }

     public String getName() {
         return name;
     }

     public int getRollNUmber() {
         return rollNUmber;
     }

     public double getMarksInPercentage() {
         return marksInPercentage;
     }

     public static void main(String[] args) {
         Student student1 = new Student("shilu", 1,70);
         Student student2 = new Student("nandini",2,50);
         Student student3 = new Student("xyz",3,35);

         List<Student> students = List.of(student1,student2,student3);
         checkResult(students);

         Scanner scanner = new Scanner(System.in);
         int numOfStudents = scanner.nextInt();
         List<Student> students1 = new ArrayList<>();
         for(int i=0; i<numOfStudents ; i++){
             Student student = new Student("", i+1,10 * i);
             students1.add(student);
         }
         checkResult(students1);
     }

     public static void checkResult(List<Student> students){
        String result;
        for(int i=0; i< students.size(); i++){
            if(students.get(i).getMarksInPercentage() < 35){
               result = students.get(i).getRollNUmber()  +  ": Fail";
            }else{
                result = students.get(i).getRollNUmber()  + ": Pass";
            }
            System.out.println(result);
        }

     }


}
