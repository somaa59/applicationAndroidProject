package com.example.myrecyclerview;
import retrofit2.Call;
import retrofit2.http.GET;
public interface EmployeeSerivece {
    @GET("/api/v1/employees")
    Call<EmployeeResponse> getEmployeesDetails();
}
