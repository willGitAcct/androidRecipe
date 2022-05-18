package com.example.recipe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton breakMenu, saladMenu, dessertMenu, mainCourseMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //to hide the action bar at the top
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        breakMenu = findViewById(R.id.breakMenu);
        saladMenu = findViewById(R.id.saladMenu);
        dessertMenu = findViewById(R.id.dessertMenu);
        mainCourseMenu = findViewById(R.id.mainCourseMenu);

        breakMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), breakMenuActivity.class);
                startActivity(intent);
            }
        });
        saladMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), saladActivity.class);
                startActivity(intent);
            }
        });
        dessertMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), dessertMenuActivity.class);
                startActivity(intent);
            }
        });
        mainCourseMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mainCourseMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}