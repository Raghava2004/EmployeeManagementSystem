package com.knot.employee;

import java.util.Map;


import java.util.HashMap;


public class Map_Test{
	public static void main(String[] args){
		System.out.println("Hi");
		Map<Integer,Employee> m=new HashMap<>();
		m.put(1,new Employee("Raghava", 10, 20));
		m.put(2,new Employee("Matt", 20, 30));
		m.put(3,new Employee("Ford", 30, 40));
		m.put(4,new Employee("Bale",40,50));
		
		//System.out.println(m);
		for(Map.Entry<Integer,Employee> i : m.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}
//
//
//package com.knot.employee;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Employee{
//    String name;
//    int age;
//    int id;
//
//    Employee(String name,int age,int id){
//        this.name=name;
//        this.id=id;
//        this.age=age;
//    }
//
//	  @Override public String toString() { return "Employee [name=" + name +
//	  ", age=" + age + ", id=" + id + "]"; }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        System.out.println(("Hello"));
//        List<Employee> list=new ArrayList<>();
//        list.add(new Employee("Raghava",21,2004));
//        list.add(new Employee("Raghava1",21,2004));
//
//        list.add(new Employee("Raghava2",21,2004));
//
//        list.add(new Employee("Raghava3",21,2004));
//
//        list.add(new Employee("Raghava4",21,2004));
//       
//        for (Employee employee : list) {
//			System.out.println(employee);
//		}
//    }
//}
