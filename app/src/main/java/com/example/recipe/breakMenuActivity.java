package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;



public class breakMenuActivity extends AppCompatActivity implements RecyclerAdapter.ClickedActivityFunction {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    String[] foodNames = {"Eggs n Bacon", "pfft pfft", "pfft pfft", "pfft pfft", "pfft pfft"};
    int[] images = {R.drawable.breakfast_choice, R.drawable.dessert_choice, R.drawable.main_choice, R.drawable.salad_choice, R.drawable.dessert_choice};


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
                        mIntent = new Intent(getApplicationContext(), break1.class);
                        startActivity(mIntent);
                        break;
                    case 2: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), break1.class);
                        startActivity(mIntent);
                        break;
                    default:
                        mIntent = new Intent(getApplicationContext(), break1.class);
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
        Intent mIntent;
        switch (index) {
            case 0: //first item in Recycler view
                mIntent = new Intent(getApplicationContext(), break1.class);
                startActivity(mIntent);
                break;
            case 1: //second item in Recycler view
                mIntent = new Intent(getApplicationContext(), break1.class);
                startActivity(mIntent);
                break;
            case 2: //third item in Recycler view
                mIntent = new Intent(getApplicationContext(), break1.class);
                startActivity(mIntent);
                break;
            default:
                mIntent = new Intent(getApplicationContext(), break1.class);
                startActivity(mIntent);
        }
    }
}
    //    private void setImages(){
//           images = {R.drawable.breakfast_choice, R.drawable.dessert_choice, R.drawable.main_choice, R.drawable.salad_choice};
//
//    }
