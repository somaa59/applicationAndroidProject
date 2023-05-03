package com.example.myrecyclerview;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeeResponse {
    @SerializedName("status")
    private String status;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<Employee> data_of_emp;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Employee> getData_of_emp() {
        return data_of_emp;
    }

    public void setData_of_emp(List<Employee> data_of_emp) {
        this.data_of_emp = data_of_emp;
    }
}

