package com.example.myrecyclerview;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    public static EmployeeSerivece buildRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dummy.restapiexample.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        EmployeeSerivece employeeSerivece = retrofit.create(EmployeeSerivece.class);
        return employeeSerivece;
    }
}
