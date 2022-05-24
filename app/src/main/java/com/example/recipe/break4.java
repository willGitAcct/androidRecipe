package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class break4 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break4);

        recipeString = "HEARTY QUINOA BOWL\n\n"

        +"\nIngredients"

                +"\n1cup water"
                +"\n½cup dry quinoa, rinsed"
                +"\n ¼medium red bell pepper, sliced thin"
                +"\n  1Tbsp. olive oil, plus more for drizzling"
                +"\n 2links precooked breakfast sausage (can use turkey sausage links)"
                +"\n 1large whole egg"
                +"\n ½lime, juiced"
                +"\n  1Tbsp. fresh cilantro, chopped, divided"
                +"\n Salt"
                +"\n Pepper"
                +"\n  2Tbsp. canned black beans, drained and rinsed"
                +"\n  3slices fresh avocado"
                +"\nLime wedges, for topping (optional)"
                +"\n Sriracha, for topping (optional)"
                +"\n Salsa, for topping (optional)"
                +"\n Sour cream, for topping (optional)"

                +"\n\n Instructions"

                +"\n\nBring 1 cup water to a boil, add quinoa and reduce to a simmer. Cover and simmer 15 minutes."

                +"\n\n Meanwhile, sauté red pepper in hot skillet with drizzle of olive oil until tender. Heat and slice sausage links per package directions. Prepare egg as desired. After quinoa has cooked, stir in 1 tablespoon olive oil, lime juice and ½ tablespoon cilantro. Season with pinch of salt and pepper."

                +"\n\n Place quinoa in bowl. Top with red pepper, beans, sausage, avocado, egg and remaining ½ tablespoon cilantro. Serve with desired toppings, and refrigerate any leftovers."


        ;
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);
    }
}