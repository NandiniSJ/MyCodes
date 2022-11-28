public class StudentProfile {
    String studentFirstName;
    String studentLastName;
    double studentGPA;
    int expectedYearToGraduate;

    public StudentProfile(String studentFirstName, String studentLastName,
                          double studentGPA, int expectedYearToGraduate){
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentGPA = studentGPA;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedYearToGraduate() {
        expectedYearToGraduate++;
    }

    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("Nandini","Jadhav",3.45,2018);
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
    }


    }

