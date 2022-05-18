package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class breakMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    String[] foodNames = {"Eggs n Bacon", "pfft pfft", "pfft pfft","pfft pfft","pfft pfft"};
    int[] images = {R.drawable.breakfast_choice, R.drawable.dessert_choice, R.drawable.main_choice, R.drawable.salad_choice, R.drawable.dessert_choice};

    ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_menu);


        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter = new RecyclerAdapter(this, foodNames, images);
        recyclerView.setAdapter(recyclerAdapter);
    }

//    private void setImages(){
//           images = {R.drawable.breakfast_choice, R.drawable.dessert_choice, R.drawable.main_choice, R.drawable.salad_choice};
//
//    }
}