package com.streams.demos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry;

public class EmployeeStreamClient {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Rob", 5000),
                new Employee("Van", 20000),
                new Employee("Dam", 30000),
                new Employee("Cris", 30000),
                new Employee("Ben", 32000));


        System.out.println("Employee with highest salary:" + employees.stream().max(Comparator.comparing(e -> e.getSalary())).get());
        System.out.println("Employee with least salary:" + employees.stream().min(Comparator.comparing(e -> e.getSalary())).get());
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        System.out.println("NEW Tests");
        System.out.println(employees.stream().filter(e -> e.getSalary() < 30000).map(e -> e.getName()).collect(Collectors.toList()));

        //show employees with salary 30000
        System.out.println("employees with salary amout");
        employees.stream().filter(e -> e.getSalary() == 32000).forEach(System.out::println);

        System.out.println("grouping by salary");
        employees.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.toList()));


        Map managersEmployee = new HashMap<Employee, Employee>();
        managersEmployee.put(new Employee("Raju",60000),employees.get(0));
        managersEmployee.put(new Employee("Raju",60000),employees.get(1));
        managersEmployee.put(new Employee("Emma",75000),employees.get(2));
        managersEmployee.put(new Employee("Emma",75000),employees.get(3));
        managersEmployee.put(new Employee("Emma",75000),employees.get(4));

        /*managersEmployee.entrySet().stream().forEach(System.out::println);
        managersEmployee.entrySet().stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue));
*/
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        map.entrySet().stream().forEach(System.out::println);
        map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));
        Map<String, String> collectedMap = map.entrySet().stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        collectedMap.entrySet().forEach(System.out::println);
    }
}
