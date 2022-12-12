import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Student1 implements Comparable<Student1>{

    int rollNum;
    String name;
    Double GPA;

    public Student1(int rollNum, String name, Double GPA){
        this.rollNum = rollNum;
        this.name = name;
        this.GPA = GPA;
    }

    public static void main(String[] args) {
        ArrayList<Student1> students = new ArrayList<Student1>();
        students.add(new Student1(1, "Nandini", 3.45));
        students.add(new Student1(2,"Shil", 4.56));
        students.add(new Student1(3,"Rubby", 6.78));

        Collections.sort(students, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(students);
        Collections.sort(students, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.rollNum-o2.rollNum;
            }
        });
        System.out.println(students);

    }

    @Override
    public String toString() {
        return "StudentComparator{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        return rollNum - o.rollNum;
    }
}

