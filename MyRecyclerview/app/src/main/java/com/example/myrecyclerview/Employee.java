package com.example.myrecyclerview;

import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("id")
    private int id ;
    @SerializedName("employee_name")
    private String name ;
    @SerializedName("employee_salary")
    private int salary ;
    @SerializedName("employee_age")
    private int age ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
