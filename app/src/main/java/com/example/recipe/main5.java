package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class main5 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        recipeString = "Quick Beef Stirfry\n\nIngredients\n" +
                "4\n" +
                "Original recipe yields 4 servings\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "    2 tablespoons vegetable oil\n" +
                "    1 pound beef sirloin, cut into 2-inch strips\n" +
                "    1 ½ cups fresh broccoli florets\n" +
                "    1 red bell pepper, cut into matchsticks\n" +
                "    2 carrots, thinly sliced\n" +
                "    1 green onion, chopped\n" +
                "    1 teaspoon minced garlic\n" +
                "    2 tablespoons soy sauce\n" +
                "    2 tablespoons sesame seeds, toasted\n" +
                "\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "\n" +
                "    Step 1\n" +
                "\n" +
                "    Heat vegetable oil in a large wok or skillet over medium-high heat; cook and stir beef until browned, 3 to 4 minutes. Move beef to the side of the wok and add broccoli, bell pepper, carrots, green onion, and garlic to the center of the wok. Cook and stir vegetables for 2 minutes.\n" +
                "    Step 2\n" +
                "\n" +
                "    Stir beef into vegetables and season with soy sauce and sesame seeds. Continue to cook and stir until vegetables are tender, about 2 more minutes.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}