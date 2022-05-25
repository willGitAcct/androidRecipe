package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class mainCourseMenuActivity extends AppCompatActivity implements RecyclerAdapter.ClickedActivityFunction{

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    String[] foodNames = {"Pasta Arrabiata", "Garlic Chicken Fried Brown Rice", "Homemade Mac and Cheese","Pan con Milanesa","Quick Beef Stir-Fry"};
    int[] images = {R.drawable.main_choice, R.drawable.main_garlic, R.drawable.main_mac, R.drawable.main_milanesa, R.drawable.main_stirfry};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course_menu);
        RecyclerAdapter.ClickedActivityFunction clicked = new RecyclerAdapter.ClickedActivityFunction() {
            @Override
            public void onClickedPic(int index) {
                Intent mIntent;
                switch (index) {
                    case 0: //first item in Recycler view
                        mIntent = new Intent(getApplicationContext(), main1.class);
                        startActivity(mIntent);
                        break;
                    case 1: //second item in Recycler view
                        mIntent = new Intent(getApplicationContext(), main2.class);
                        startActivity(mIntent);
                        break;
                    case 2: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), main3.class);
                        startActivity(mIntent);
                        break;
                    case 3: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), main4.class);
                        startActivity(mIntent);
                        break;
                    default:
                        mIntent = new Intent(getApplicationContext(), main5.class);
                        startActivity(mIntent);
                }
            }
        };

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter = new RecyclerAdapter(this, foodNames, images, clicked);
        recyclerView.setAdapter(recyclerAdapter);
    }
    @Override
    public void onClickedPic(int index) {


    }
}