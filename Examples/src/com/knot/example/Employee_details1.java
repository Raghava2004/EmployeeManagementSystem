package com.knot.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Employee_details1 {
    public static void main(String[] args) {
        System.out.println("Hi");
        List<Employee> emp = new ArrayList<>();

        List<String> names = Arrays.asList("Raghava", "Kamilini", "Pramod", "Priya", "Mukesh", "Ratan", "Sarojini");
        List<String> lname = Arrays.asList("Chintalapati", "Mukherjee", "Parekh", "Sahni", "Ambani", "Tata", "Naidu");
        List<Integer> ages = Arrays.asList(25, 30, 28, 35, 40, 22, 30);
        List<Integer> idsList = Arrays.asList(101, 102, 103, 104, 105, 106, 45);
        List<String> gender = new LinkedList<>(Arrays.asList("Male", "Female", "Male", "Female", "Male", "Male", "Female"));
        List<Integer> yoe = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        for (int i = 0; i < names.size(); i++) {
            // Wrap each id in a list
            List<Integer> idList = Arrays.asList(idsList.get(i));
            emp.add(new Employee(names.get(i), Arrays.asList(lname.get(i)), ages.get(i), idList, Arrays.asList(gender.get(i)), Arrays.asList(yoe.get(i))));
        }

        // Print all employees
        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}