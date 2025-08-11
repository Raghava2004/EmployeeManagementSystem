package com.knot.example;

import java.util.List;

public class Employee {
    private String name;
    private List<String> lname;
    private Integer age;
    private List<Integer> ids;
    private List<String> gender;
    private List<Integer> yoe;

    public Employee(String name, List<String> lname, Integer age, List<Integer> ids, List<String> gender, List<Integer> yoe) {
        super();
        this.name = name;
        this.lname = lname;
        this.age = age;
        this.ids = ids;
        this.gender = gender;
        this.yoe = yoe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLname() {
        return lname;
    }

    public void setLname(List<String> lname) {
        this.lname = lname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public List<String> getGender() {
        return gender;
    }

    public void setGender(List<String> gender) {
        this.gender = gender;
    }

    public List<Integer> getYoe() {
        return yoe;
    }

    public void setYoe(List<Integer> yoe) {
        this.yoe = yoe;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", lname=" + lname + ", age=" + age + 
               ", ids=" + ids + ", gender=" + gender + ", yoe=" + yoe + "]";
    }
}