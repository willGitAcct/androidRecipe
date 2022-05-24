package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;



public class breakMenuActivity extends AppCompatActivity implements RecyclerAdapter.ClickedActivityFunction {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    String[] foodNames = {"Breakfast Smoothie Bowl", "Breakfast Burrito", "Egg n Bacon McMuffin", "Hearty Quinoa Bowl", "Quick Quiche"};
    int[] images = {R.drawable.breakfast_choice, R.drawable.break_burrito, R.drawable.break_egg_bacon, R.drawable.break_quinoa_bowl, R.drawable.break_quiche};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_menu);
        RecyclerAdapter.ClickedActivityFunction clicked = new RecyclerAdapter.ClickedActivityFunction() {
            @Override
            public void onClickedPic(int index) {
                Intent mIntent;
                switch (index) {
                    case 0: //first item in Recycler view
                        mIntent = new Intent(getApplicationContext(), break1.class);
                        startActivity(mIntent);
                        break;
                    case 1: //second item in Recycler view
                        mIntent = new Intent(getApplicationContext(), break2.class);
                        startActivity(mIntent);
                        break;
                    case 2: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), break3.class);
                        startActivity(mIntent);
                        break;
                    case 3:
                        mIntent = new Intent(getApplicationContext(), break4.class);
                        startActivity(mIntent);
                        break;
                    default:
                        mIntent = new Intent(getApplicationContext(), break5.class);
                        startActivity(mIntent);
                }
            }
        };

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerAdapter = new RecyclerAdapter(this, foodNames, images, clicked);
        recyclerView.setAdapter(recyclerAdapter);
        //
    }

   @Override
    public void onClickedPic(int index) {

        }
    }

    //    private void setImages(){
//           images = {R.drawable.breakfast_choice, R.drawable.dessert_choice, R.drawable.main_choice, R.drawable.salad_choice};
//
//    }
