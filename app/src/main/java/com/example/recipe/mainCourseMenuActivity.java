package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class mainCourseMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    String[] foodNames = {"Eggs n Bacon", "pfft pfft", "pfft pfft","pfft pfft","pfft pfft"};
    int[] images = {R.drawable.breakfast_choice, R.drawable.dessert_choice, R.drawable.main_choice, R.drawable.salad_choice, R.drawable.dessert_choice};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course_menu);


        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter = new RecyclerAdapter(this, foodNames, images);
        recyclerView.setAdapter(recyclerAdapter);
    }
}