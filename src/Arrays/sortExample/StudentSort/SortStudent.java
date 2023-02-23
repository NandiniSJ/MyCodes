package Arrays.sortExample.StudentSort;

import java.util.*;

public class SortStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < numOfStudents; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            Double CGPA = scanner.nextDouble();

            Student student = new Student(id, name, CGPA);
            studentList.add(student);
        }

        studentList.stream()
                .sorted(Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId))
                .forEach(student -> {
                    System.out.println(student.getName());
                });

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.getCGPA() != b.getCGPA()) {
                    return Double.compare(a.getCGPA(), b.getCGPA());
                } else {
                    if (!a.getName().equals(b.getName())) {
                        return a.getName().compareTo(b.getName());
                    } else {
                        return a.getId() - b.getId();
                    }
                }
            }
        });

        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }
}
