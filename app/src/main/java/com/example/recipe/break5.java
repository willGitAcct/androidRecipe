package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class break5 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break5);


        recipeString = "QUICK BREAKFAST QUICHE\n\n"
        +"\nIngredients:"
                +"\n\n1 red bell pepper"
                +"\n1 green bell pepper"
                +"\n½ medium onion"
                +"\n 1 cup mushrooms"
                +"\n2-3 thin slices ham"
                +"\n 2 cups egg substitute"
                +"\n½ cup shredded Monterrey Jack cheese"
                +"\n Sprinkle of crushed red pepper flakes"
                +"\n 2 tsp EVOO"
                +"\n 1 ½ TBSP organic no salt seasoning (I used Kirkland brand)"
                +"\n Cooking spray"
                +"\n\nSaute veggies in olive oil, seasonings and red pepper flakes until softening."

                +"\n\n Place in a 9 inch round baking pan that has been sprayed with cooking spray.  Sprinkle torn pieces of ham, then eggs  and cheese on top of veggies."

                +"\n\nBake on 350 for 25 minutes or until set."

                +"\n\nServe warm.  Store left-overs in fridge and reheat for 30 seconds in microwave."

                +"\n\nFor lunch, or breakfast on the go, serve wrapped in a whole wheat tortilla."
        ;
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);
    }
}