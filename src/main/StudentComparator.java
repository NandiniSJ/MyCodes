package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class StudentComparator implements Comparable<StudentComparator>{

    int rollNum;
    String name;
    Double GPA;

    public StudentComparator(int rollNum, String name, Double GPA){
        this.rollNum = rollNum;
        this.name = name;
        this.GPA = GPA;
    }

    public static void main(String[] args) {
        ArrayList<StudentComparator> students = new ArrayList<StudentComparator>();
        students.add(new StudentComparator(1, "Nandini", 3.45));
        students.add(new StudentComparator(2,"Shil", 4.56));
        students.add(new StudentComparator(3,"Rubby", 6.78));

        Collections.sort(students, new Comparator<StudentComparator>() {
            @Override
            public int compare(StudentComparator o1, StudentComparator o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(students);
        Collections.sort(students, new Comparator<StudentComparator>() {
            @Override
            public int compare(StudentComparator o1, StudentComparator o2) {
                return o1.rollNum-o2.rollNum;
            }
        });
        System.out.println(students);

    }

    @Override
    public String toString() {
        return "main.StudentComparator{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(StudentComparator o) {
        return rollNum - o.rollNum;
    }
}

