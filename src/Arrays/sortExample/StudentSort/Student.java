package Arrays.sortExample.StudentSort;

import java.util.*;

public class Student implements Comparable<Student>{

    int id;
    String Name;
    double CGPA;

    public Student(int id, String name, double CGPA) {
        this.id = id;
        Name = name;
        this.CGPA = CGPA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getCGPA() {
        return CGPA;
    }


    @Override
    public int compareTo(Student o) {
        if(this.getCGPA() != o.getCGPA()){
            return Double.compare(this.getCGPA(), o.getCGPA());
        }else {
            if(!this.getName().equals(o.getName())){
                return this.getName().compareTo(o.getName());
            }else{
                return this.getId()- o.getId();
            }
        }
    }
}
