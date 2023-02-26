package employeeDB;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeApplicationTest {

    @Test
    void shouldReturnAvgAgeOfEmployee(){
        List<Employee> employees = List.of(
                new Employee("Shilkumar J", 28, Gender.MALE, "Software Developer","Merchant lending"),
                new Employee("Nandini J", 25, Gender.FEMALE, "Software Developer","GoFood"),
                new Employee("Parth J", 20, Gender.MALE, "Software Developer","GoFood"),
                new Employee("Pratik J", 25, Gender.MALE, "Business Analyst","Merchant lending"));

        EmployeeApplication employeeApplication = new EmployeeApplication(employees);


        assertEquals(24.5, employeeApplication.getAverageAge());
    }

    @Test
    void shouldReturnAvgAgeByGender(){
        List<Employee> employees = List.of(
                new Employee("Shilkumar J", 28, Gender.MALE, "Software Developer","Merchant lending"),
                new Employee("Nandini J", 25, Gender.FEMALE, "Software Developer","GoFood"),
                new Employee("Parth J", 20, Gender.MALE, "Software Developer","GoFood"),
                new Employee("Pratik J", 25, Gender.MALE, "Business Analyst","Merchant lending"));

        EmployeeApplication employeeApplication = new EmployeeApplication(employees);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        assertEquals("24.33" ,decimalFormat.format(employeeApplication.getAvgAgeByGender(Gender.MALE)));
    }

    @Test
    void shouldReturnAvgAgeByDesignation(){
        List<Employee> employees = List.of(
                new Employee("Shilkumar J", 28, Gender.MALE, "Software Developer","Merchant lending"),
                new Employee("Nandini J", 25, Gender.FEMALE, "Software Developer","GoFood"),
                new Employee("Parth J", 20, Gender.MALE, "Software Developer","GoFood"),
                new Employee("Pratik J", 25, Gender.MALE, "Business Analyst","Merchant lending"));

        EmployeeApplication employeeApplication = new EmployeeApplication(employees);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        assertEquals("24.33", decimalFormat.format(employeeApplication.getAvgAgeByDesignation("Software Developer")) );
    }

    @Test
    void shouldGroupByGender(){
        List<Employee> employees = List.of(
                new Employee("Shilkumar J", 28, Gender.MALE, "Software Developer","Merchant lending"),
                new Employee("Nandini J", 25, Gender.FEMALE, "Software Developer","GoFood")
        );

        EmployeeApplication employeeApplication = new EmployeeApplication(employees);
        Map<Gender, List<Employee>> groupByGender = employeeApplication.groupByGender();

        assertEquals("Nandini J", groupByGender.get(Gender.FEMALE).get(0).getName());
        assertEquals("Shilkumar J", groupByGender.get(Gender.MALE).get(0).getName());

    }

    @Test
    void shouldGroupByAgeGroup(){
        List<Employee> employees = List.of(
                new Employee("Shilkumar J", 28, Gender.MALE, "Software Developer","Merchant lending"),
                new Employee("Nandini J", 25, Gender.FEMALE, "Software Developer","GoFood")
        );
        EmployeeApplication employeeApplication = new EmployeeApplication(employees);
        Map<String, List<Employee>> groupByAge = employeeApplication.groupByAgeGroup();
        assertEquals("Nandini J", groupByAge.get("20 - 25").get(0).getName());
        assertEquals("Shilkumar J", groupByAge.get("26 - 30").get(0).getName());

    }

    @Test
    void shouldSortMaleEmployeeByAge(){
        List<Employee> employees = List.of(
                new Employee("Shilkumar J", 28, Gender.MALE, "Software Developer","Merchant lending"),
                new Employee("Nandini J", 25, Gender.FEMALE, "Software Developer","GoFood"),
                new Employee("Parth J", 20, Gender.MALE, "Software Developer","GoFood"),
                new Employee("Pratik J", 25, Gender.MALE, "Business Analyst","Merchant lending"),
                new Employee("Pranav J", 25, Gender.MALE, "Project Manager","Merchant lending"),
                new Employee("Piyusha J", 30, Gender.FEMALE, "Business Analyst","GoFood")
        );

        EmployeeApplication employeeApplication = new EmployeeApplication(employees);
        List<Employee> maleEmployee = employeeApplication.sortEmployee(employees);

        assertEquals("Pranav J", maleEmployee.get(1).getName());
        assertEquals(28, maleEmployee.get(3).getAge());
    }

    @Test
    void shouldReturnListOfEmployeeByDepartment(){
        List<Employee> employees = List.of(
                new Employee("Shilkumar J", 28, Gender.MALE, "Software Developer","Merchant lending"),
                new Employee("Nandini J", 25, Gender.FEMALE, "Software Developer","GoFood"),
                new Employee("Parth J", 20, Gender.MALE, "Software Developer","GoFood"),
                new Employee("Pratik J", 25, Gender.MALE, "Business Analyst","Merchant lending"),
                new Employee("Pranav J", 25, Gender.MALE, "Project Manager","Merchant lending"),
                new Employee("Piyusha J", 30, Gender.FEMALE, "Business Analyst","GoFood")
        );

        EmployeeApplication employeeApplication = new EmployeeApplication(employees);
        List<Employee> goFoodEmployees = employeeApplication.getByDepartment(employees, "GoFood");

        assertEquals(goFoodEmployees.size(), 3);
        assertEquals(goFoodEmployees.get(0).getName(), "Nandini J");


    }

}