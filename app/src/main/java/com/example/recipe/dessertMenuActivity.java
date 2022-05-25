package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class dessertMenuActivity extends AppCompatActivity implements RecyclerAdapter.ClickedActivityFunction{

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    String[] foodNames = {"Flan Dessert", "Flourless Peanut Butter Cookies", "Eclair Cake","Chocolate Brownies","Chocolate Chip Cookie Dough"};
    int[] images = {R.drawable.dessert_choice, R.drawable.dessert_cookies, R.drawable.dessert_eclair, R.drawable.dessert_brownies, R.drawable.dessert_dough};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_menu);
        RecyclerAdapter.ClickedActivityFunction clicked = new RecyclerAdapter.ClickedActivityFunction() {
            @Override
            public void onClickedPic(int index) {
                Intent mIntent;
                switch (index) {
                    case 0: //first item in Recycler view
                        mIntent = new Intent(getApplicationContext(), dessert1.class);
                        startActivity(mIntent);
                        break;
                    case 1: //second item in Recycler view
                        mIntent = new Intent(getApplicationContext(), dessert2.class);
                        startActivity(mIntent);
                        break;
                    case 2: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), dessert3.class);
                        startActivity(mIntent);
                        break;
                    case 3:
                        mIntent = new Intent(getApplicationContext(), dessert4.class);
                        startActivity(mIntent);
                        break;
                    default:
                        mIntent = new Intent(getApplicationContext(), dessert5.class);
                        startActivity(mIntent);
                }
            }
        };
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter = new RecyclerAdapter(this, foodNames, images,clicked);
        recyclerView.setAdapter(recyclerAdapter);
    }
    @Override
    public void onClickedPic(int index) {

    }
}