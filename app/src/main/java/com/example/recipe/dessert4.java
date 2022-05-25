package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class dessert4 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert4);
        recipeString = "Quick Brownies\n\nIngredients\n" +
                "20\n" +
                "Original recipe yields 20 servings\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "    1 cup butter, melted\n" +
                "    2 cups white sugar\n" +
                "    ½ cup cocoa powder\n" +
                "    1 teaspoon vanilla extract\n" +
                "    4 eggs\n" +
                "    1 ½ cups all-purpose flour\n" +
                "    ½ teaspoon baking powder\n" +
                "    ½ teaspoon salt\n" +
                "    ½ cup walnut halves\n" +
                "\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "\n" +
                "    Step 1\n" +
                "\n" +
                "    Preheat the oven to 350 degrees F (175 degrees C). Grease a 9x13-inch pan.\n" +
                "    Step 2\n" +
                "\n" +
                "    Combine the melted butter, sugar, cocoa powder, vanilla, eggs, flour, baking powder, and salt. Spread the batter into the prepared pan. Decorate with walnut halves, if desired.\n" +
                "    Step 3\n" +
                "\n" +
                "    Bake in preheated oven for 20 to 30 minutes or until a toothpick inserted in the center comes out with crumbs, not wet. Cool on wire rack.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}