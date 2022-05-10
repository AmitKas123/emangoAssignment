package com.example.emangoassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Carrer extends AppCompatActivity {
    RecyclerView recyclerView;
    // Declare an adapter
    RecyclerView.Adapter ProgramAdapter;
    RecyclerView.LayoutManager layoutmanager;
    String arr[] = {"Data Analyst", "Android Developer", "Product Designer", "Manager", "HR", "Data Scientist", "Software Developer"};
    String location[] = {"Noida", "Delhi", "Mumbai", "Chennai", "Banglore", "Delhi", "Bhopal"};
    String exp[]={"fresher","1-2year","3-5year","5-8 year","fresher","1-2year","3-5year"};
    String qulification[] = {"CS", "Any Branch", "Commerce", "CS", "Ph.D in English","Any Branch", "Any branch"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrer);
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);

        layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);

        ProgramAdapter programAdapter = new ProgramAdapter(this,arr,location,exp,qulification);
        recyclerView.setAdapter(programAdapter);
    }
}
class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ViewHolder> {

    Context context;
    String[] job;
    String[] exper;
    String[] degree;
    String[] location;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        TextView textview1 ;
        TextView textView2;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textview1 = itemView.findViewById(R.id.textView2);
            textView2=itemView.findViewById(R.id.textView3);

        }
    }
    public ProgramAdapter(Context context, String[] job, String[] exper, String[] degree,String[] location){
        this.context = context;
        this.job = job;
        this.exper = exper;
        this.location = location;
        this.degree=degree;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.careerdata, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(job[position]);
        holder.textview1.setText(exper[position]);
        holder.textView2.setText(location[position]);
        holder.textView2.setText(degree[position]);
    }

    @Override
    public int getItemCount() {
        return job.length;
    }
}
