package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class dessert5 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert5);
        recipeString = "Edible Cookie Dough\n\nIngredients\n" +
                "8\n" +
                "Original recipe yields 8 servings\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "    ¾ cup packed brown sugar\n" +
                "    ½ cup butter\n" +
                "    1 teaspoon vanilla extract\n" +
                "    ½ teaspoon salt\n" +
                "    1 cup all-purpose flour\n" +
                "    2 tablespoons milk\n" +
                "    ½ cup milk chocolate chips\n" +
                "    ½ cup mini chocolate chips\n" +
                "\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "\n" +
                "    Step 1\n" +
                "\n" +
                "    Combine brown sugar and butter in a large bowl; beat with an electric mixer until creamy. Beat in vanilla extract and salt. Add flour; mix until a crumbly dough forms. Mix in milk. Fold in milk chocolate chips and mini chocolate chips.\n" +
                "\n" +
                "Editor's Note:\n" +
                "\n" +
                "There is a potential risk of foodborne illness from the consumption of raw flour.";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}