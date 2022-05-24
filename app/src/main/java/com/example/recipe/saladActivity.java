package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class saladActivity extends AppCompatActivity implements RecyclerAdapter.ClickedActivityFunction{
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    String[] foodNames = {"Black Bean and Corn Salad", "Asparagus and Feta Salad", "Caprese Salad w/ Balsamic Glaze","Thai Quinoa Salad","Roasted Pepper Salad with Feta, Pine Nuts & Basil"};
    int[] images = {R.drawable.salad_choice, R.drawable.salad_aspar, R.drawable.salad_caprese, R.drawable.salad_thai, R.drawable.salad_pepper};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);
        RecyclerAdapter.ClickedActivityFunction clicked = new RecyclerAdapter.ClickedActivityFunction() {
            @Override
            public void onClickedPic(int index) {
                Intent mIntent;
                switch (index) {
                    case 0: //first item in Recycler view
                        mIntent = new Intent(getApplicationContext(), salad1.class);
                        startActivity(mIntent);
                        break;
                    case 1: //second item in Recycler view
                        mIntent = new Intent(getApplicationContext(), salad2.class);
                        startActivity(mIntent);
                        break;
                    case 2: //third item in Recycler view
                        mIntent = new Intent(getApplicationContext(), salad3.class);
                        startActivity(mIntent);
                        break;
                    case 3:
                        mIntent = new Intent(getApplicationContext(), salad4.class);
                        startActivity(mIntent);
                        break;
                    default:
                        mIntent = new Intent(getApplicationContext(), salad5.class);
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