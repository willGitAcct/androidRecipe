package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class main2 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recipeString = "Garlic Chicken Fried Rice\n\nIngredients\n" +
                "3\n" +
                "Original recipe yields 3 servings\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "    2 tablespoons vegetable oil, divided\n" +
                "    8 ounces skinless, boneless chicken breast, cut into strips\n" +
                "    ½ red bell pepper, chopped\n" +
                "    ½ cup green onion, chopped\n" +
                "    4 cloves garlic, minced\n" +
                "    3 cups cooked brown rice\n" +
                "    2 tablespoons light soy sauce\n" +
                "    1 tablespoon rice vinegar\n" +
                "    1 cup frozen peas, thawed\n" +
                "\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "\n" +
                "    Step 1\n" +
                "\n" +
                "    Heat 1 tablespoon of vegetable oil in a large skillet set over medium heat. Add the chicken, bell pepper, green onion and garlic. Cook and stir until the chicken is cooked through, about 5 minutes. Remove the chicken to a plate and keep warm.\n" +
                "    Step 2\n" +
                "\n" +
                "    Heat the remaining tablespoon of oil in the same skillet over medium-high heat. Add the rice; cook and stir to heat through. Stir in the soy sauce, rice vinegar and peas, and continue to cook for 1 minute. Return the chicken mixture to the skillet and stir to blend with the rice and heat through before serving.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}