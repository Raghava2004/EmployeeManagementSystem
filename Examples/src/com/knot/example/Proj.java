package com.knot.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Proj {
    public static void main(String[] args) {
        System.out.println("Hi");
        List<Employee> emp = new ArrayList<>();
        
        List<String> names = Arrays.asList("Raghava", "Kamilini", "Pramod", "Priya", "Mukesh", "Ratan","Sarojini");
        List<String> lname = Arrays.asList("Chintalapati", "Mukherjee", "Parekh", "Sahni", "Ambani", "Tata","Naidu");
        List<Integer> ages = Arrays.asList(25, 30, 28, 35, 40, 22,30);
        List<Integer> idsList =Arrays.asList(101, 102, 103, 104, 105, 106,45);
        Queue<String> gender =new LinkedList<>( Arrays.asList("Male", "Female", "Male", "Female", "Male", "Male","Female"));
        Queue<Integer> yoe = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6,7));
            /*            
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            Integer age = ages.get(i);
            Integer id = idsList.get(i);
            // For each person, you might want to create their own set and queue if needed
            Set<Integer> individualIds = new HashSet<>();
            individualIds.add(id);
            Queue<Integer> individualYoe = new LinkedList<>();
            individualYoe.add(yoe.poll()); // or assign as needed
            Queue<String> individualGen = new LinkedList<>();
            individualGen.add(gender.poll()); // or assign as needed
            Employee employee = new Employee( name, age, id, individualIds,individualYoe, Arrays.asList(lname.get(i)), individualGen );
            emp.add(employee);
        } */       
        // Print all employees
        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}