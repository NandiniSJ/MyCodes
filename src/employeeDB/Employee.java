package employeeDB;

public class Employee {

    private String name;
    private int age;
    private Gender gender;
    private String designation;
    private String department;

    public Employee(String name, int age, Gender gender, String designation, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.designation = designation;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAgeGroup(){
        if(age >= 20 && age <= 25){
            return  "20 - 25";
        }
        return "26 - 30";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
