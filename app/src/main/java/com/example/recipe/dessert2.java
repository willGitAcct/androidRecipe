package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class dessert2 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert2);
        recipeString = "Flourless Peanut Butter Cookies\n\nIngredients\n" +

                "Original recipe yields 12 servings\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "    1 cup peanut butter\n" +
                "    ½ cup white sugar\n" +
                "    ⅓ cup packed brown sugar\n" +
                "    1 egg\n" +
                "    1 teaspoon vanilla extract\n" +
                "    ½ teaspoon baking soda\n" +
                "    ½ cup semisweet chocolate chips (Optional)\n" +
                "\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "\n" +
                "    Step 1\n" +
                "\n" +
                "    Preheat oven to 350 degrees F (175 degrees C).\n" +
                "    Step 2\n" +
                "\n" +
                "    Beat peanut butter, white sugar, and brown sugar together in a large bowl with an electric mixer until smooth. Stir egg, vanilla extract, and baking soda into peanut butter mixture; stir in chocolate chips.\n" +
                "    Step 3\n" +
                "\n" +
                "    Drop mixture by small rounded spoonfuls onto a baking sheet about 2 inches apart.\n" +
                "    Step 4\n" +
                "\n" +
                "    Bake in the preheated oven until cookies are flattened and golden, about 8 minutes.\n" +
                "\n" +
                "Cook's Note:\n" +
                "\n" +
                "Use either smooth or crunchy peanut butter.";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}