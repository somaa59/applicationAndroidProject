package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
EmployeeAdapter employeeAdapter ;
Context context ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(this);
        recyclerView.setAdapter(employeeAdapter);
        EmployeeSerivece employeeSerivece = RetrofitBuilder.buildRetrofit();

        employeeSerivece.getEmployeesDetails().enqueue(new Callback<EmployeeResponse>() {
            @Override
            public void onResponse(Call<EmployeeResponse> call, Response<EmployeeResponse> response) {
                EmployeeResponse employeeResponse = response.body();
                List<Employee> employeeList = employeeResponse.getData_of_emp();
                employeeAdapter.addEmployee(employeeList);


            }

            @Override
            public void onFailure(Call<EmployeeResponse> call, Throwable t) {

            }
        });
 ;
    }


}
