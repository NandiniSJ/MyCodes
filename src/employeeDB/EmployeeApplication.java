package employeeDB;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeApplication {
    List<Employee> employees;
    public EmployeeApplication(List<Employee> employees) {
        this.employees = employees;
    }

    public double getAverageAge(){
        double totalAge = 0;
//        for(int i=0; i<employees.size(); i++){
//           totalAge = totalAge + employees.get(i).getAge();
//        }
//        return totalAge / employees.size();

        return employees.stream()
                .map(employee -> employee.getAge())
                .map(age -> age.doubleValue())
                .reduce(0.0, Double::sum) / employees.size();
    }

    public double getAvgAgeByGender(Gender gender){
//       double age = 0;
        //int numberOfEmployee = 0;
//        for (Employee employee : employees) {
//            if (employee.getGender() == gender) {
//                age = age + employee.getAge();
//                numberOfEmployee++;
//            }
//        }
//        return age/numberOfEmployee;

        double totalAge = employees.stream()
                .filter(employee -> employee.getGender().equals(gender))
                .map(employee -> employee.getAge())
                .map(age-> age.doubleValue())
                .reduce(0.0,Double::sum);

        Long numberOfEmployee = employees.stream()
                .filter(employee -> employee.getGender().equals(gender))
                .count();

        return totalAge/numberOfEmployee;
    }

    public double getAvgAgeByDesignation(String designation){
//        double totalAge = 0;
//        int count = 0;
//        for(int i=0 ; i<employees.size(); i++){
//            if(employees.get(i).getDesignation().equals(designation)){
//                totalAge = totalAge + employees.get(i).getAge();
//                count++;
//            }
//        }
//        return totalAge/count;

        double totalAge = employees.stream()
                .filter(employee -> employee.getDesignation().equals(designation))
                .map(employee -> employee.getAge())
                .map(age -> age.doubleValue())
                .reduce(0.0, Double::sum);

        Long numberOfEmployee = employees.stream()
                .filter(employee -> employee.getDesignation().equals(designation))
                .count();

        return totalAge/numberOfEmployee;
    }

    public Map<Gender, List<Employee>> groupByGender(){
//        List<Employee> maleEmployee = new ArrayList<>();
//        List<Employee> femaleEmployee = new ArrayList<>();
//
//        for(int i = 0; i < employees.size(); i++){
//            if(employees.get(i).getGender() == Gender.MALE){
//                maleEmployee.add(employees.get(i));
//            }else{
//                femaleEmployee.add(employees.get(i));
//            }
//        }
//        HashMap<Gender, List<Employee>> employeeGroupByGender = new HashMap<>();
//        employeeGroupByGender.put(Gender.MALE, maleEmployee);
//        employeeGroupByGender.put(Gender.FEMALE, femaleEmployee);
//
//        return employeeGroupByGender;
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getGender()));
    }

    public Map<String, List<Employee>> groupByAgeGroup(){
//        List<Employee> ageFrom20to25 = new ArrayList<>();
//        List<Employee> ageFrom26to30 = new ArrayList<>();
//        Map<String, List<Employee>> groupByAgeGroup = new HashMap<>();
//
//        for(int i = 0; i < employees.size(); i++){
//            if(employees.get(i).getAge() >=20 && employees.get(i).getAge()<=25){
//            ageFrom20to25.add(employees.get(i));
//            } else if (employees.get(i).getAge() > 26 && employees.get(i).getAge() <= 30) {
//                ageFrom26to30.add(employees.get(i));
//            }
//        }
//        groupByAgeGroup.put("20 - 25", ageFrom20to25);
//        groupByAgeGroup.put("26 - 30", ageFrom26to30);
//
//        return groupByAgeGroup;

        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getAgeGroup()));

    }

    public List<Employee> sortEmployee(List<Employee> employees){
//        List<Employee> maleEmployees = new ArrayList<>();
//        for (int i = 0; i < employees.size(); i++) {
//           if(employees.get(i).getGender() == Gender.MALE){
//              maleEmployees.add(employees.get(i));
//           }
//        }
//        maleEmployees.sort((o1, o2) -> {
//            if (o1.getAge() == o2.getAge()) {
//                return o1.getName().compareTo(o2.getName());
//            } else {
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        });
//        return maleEmployees;
        return employees.stream()
                .filter(employee -> employee.getGender().equals(Gender.MALE))
                .sorted(Comparator.comparing(Employee::getAge)
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());
    }

    public List<Employee> getByDepartment(List<Employee> employees, String department){
//        List<Employee> employeeListByDept = new ArrayList<>();
//        for(int i = 0; i< employees.size(); i++){
//            if(employees.get(i).getDepartment().equals(department)){
//                employeeListByDept.add(employees.get(i));
//            }
//        }
//        return employeeListByDept;
       return employees.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    public Map<String, Integer> countEmployeeByDept(List<Employee> employees){
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()))
                .entrySet()
                .stream()
                .map(entry -> Map.entry(entry.getKey(), entry.getValue().size()))
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
    }



    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Shilkumar J", 28, Gender.MALE, "Software Developer","Merchant lending"),
                new Employee("Nandini J", 25, Gender.FEMALE, "Software Developer","GoFood"),
                new Employee("Parth J", 20, Gender.MALE, "Software Developer","GoFood"),
                new Employee("Pratik J", 25, Gender.MALE, "Business Analyst","Merchant lending"),
                new Employee("Pranav J", 25, Gender.MALE, "Project Manager","Merchant lending"),
                new Employee("Piyusha J", 30, Gender.FEMALE, "Business Analyst","GoFood")
        );
        EmployeeApplication employeeApplication = new EmployeeApplication(employees);
//        System.out.println(employeeApplication.getAverageAge());
//        System.out.println(employeeApplication.getAvgAgeByGender(Gender.FEMALE));
//        System.out.println(employeeApplication.getAvgAgeByDesignation("Software Developer"));
//       System.out.println(employeeApplication.groupByGender());
//          System.out.println(employeeApplication.groupByAgeGroup());
        //System.out.println(employeeApplication.sortEmployee(employees));

        //System.out.println(employeeApplication.getByDepartment(employees,"GoFood"));
        System.out.println(employeeApplication.countEmployeeByDept(employees));
    }
}
