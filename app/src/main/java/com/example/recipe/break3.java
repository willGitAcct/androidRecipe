package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class break3 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break3);
        recipeString = "EGG N BACON MCMUFFIN\n\n"
        +"\nIngredients"


                +"\n▢ 6 English Muffins"
                +"\n▢ 6 large eggs"
                +"\n▢ 6 ounces sharp cheddar cheese"
                +"\n▢ 12 slices thick cut bacon"
                +"\n▢ 4 tablespoons butter , divided"

                +"\n\n Instructions"
                +"\n\nPreheat the oven to 400 degrees."
                +"\n On a large cookie sheet, line with parchment paper and arrange the 12 bacon slices into 6 circles, with two pieces for each circle."
                +"\nAdd the first piece of bacon in the shape of a 4-5 inch circle then layer the second one on top, add the tail of the second piece under the end of the first piece, so that when they cook they stick together."
                +"\nPut in the oven to bake for 18-20 minutes."
                +"\n\n       Slice 6 english muffins in half and spread 3 tablespoons of the butter on the cut sides, ½ a tablespoon on each half muffin."
                +"\n In the last five minutes of baking time for the bacon add the English muffins to the oven, cut side up."
                +"\n Slice the cheddar cheese thickly into six slices."
                +"\n In a large skillet melt the remaining tablespoon of butter."
                +"\n Crack the eggs gently into the skillet, add salt and pepper."
                +"\n   Cook until the eggs are JUST set."
                +"\n\n  Take the English muffins out of the oven, layer with the cheese, egg, bacon and the top of the muffin."
                +"\n  Remove the parchment paper from the cookie sheet carefully, add the sandwiches back onto the pan (wipe out any remaining oil with a paper towel)."
                +"\n \n Bake for 2-3 minutes, or until the cheese is melted."
        ;
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);
    }
}