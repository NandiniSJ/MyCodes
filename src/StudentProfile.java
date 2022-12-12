import java.util.*;
import java.util.Collections;

public class StudentProfile implements  Comparable<StudentProfile>{
    String studentFirstName;
    String studentLastName;
    double studentGPA;
    int expectedYearToGraduate;

    public StudentProfile(String studentFirstName, String studentLastName, double studentGPA, int expectedYearToGraduate) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentGPA = studentGPA;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedYearToGraduate() {
        expectedYearToGraduate++;
    }

    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("Nandini", "Jadhav", 3.45, 2018);
        StudentProfile studentB = new StudentProfile("Shil", "Jadhav", 4.56, 2018);

        System.out.println("Profile of StudentA");
        System.out.println(studentA.studentFirstName);
        System.out.println(studentA.studentLastName);
        System.out.println(studentA.studentGPA);
        System.out.println(studentA.expectedYearToGraduate);
        System.out.println("Profile of StudentB");
        System.out.println(studentB.studentFirstName);
        System.out.println(studentB.studentLastName);
        System.out.println(studentB.studentGPA);
        System.out.println(studentB.expectedYearToGraduate);

        studentA.incrementExpectedYearToGraduate();

        System.out.println(studentA.expectedYearToGraduate);
        Collections.sort(List.of(studentA, studentB), new Comparator<StudentProfile>() {
            @Override
            public int compare(StudentProfile o1, StudentProfile o2) {
                return Double.compare(o1.studentGPA, o2.studentGPA);
            }
        });
    }


    @Override
    public int compareTo(StudentProfile o) {
        return studentFirstName.compareTo(o.studentFirstName);
    }
}

