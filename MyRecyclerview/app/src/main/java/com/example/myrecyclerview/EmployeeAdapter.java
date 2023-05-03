package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.itemViewHolder> {
Context context ;
List<Employee>employeeList = new ArrayList<>();
EmployeeAdapter (Context context){
    this.context = context ;
}
void addEmployee (List<Employee>employeeList){
    employeeList.addAll(employeeList);
    notifyDataSetChanged();
}

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
    Employee employee = employeeList.get(position);
    holder.id.setText(employee.getId() + "");
    holder.name.setText(employee.getName());
    holder.salary.setText(employee.getSalary() + "");
    holder.age.setText(employee.getAge() + "");

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    class itemViewHolder extends RecyclerView.ViewHolder {
        TextView id ;
        TextView name ;
        TextView salary ;
        TextView age ;
        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
            id =itemView.findViewById(R.id.id);
            name = itemView.findViewById(R.id.name);
            salary = itemView.findViewById(R.id.salary);
            name = itemView.findViewById(R.id.age);
            age = itemView.findViewById(R.id.age);



        }
    }
}
