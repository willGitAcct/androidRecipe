package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class break2 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break2);

        recipeString = "BREAKFAST BURRITO\n\n"
        +"\nIngredients"
                +"\nIngredient Checklist"

                +"\nPico de gallo:"
                +"\n1 ½ cups chopped tomato (about 1 large)"
                +"\n½ cup chopped green onions"
                +"\n½ cup chopped fresh cilantro"
                +"\n2 teaspoons fresh lemon juice"
                +"\n⅛ teaspoon salt"
                +"\n⅛ teaspoon black pepper"
                +"\n Dash of crushed red pepper"
                +"\n Burritos:"
                +"\n¼ teaspoon chopped fresh oregano"
                +"\n⅛ teaspoon salt"
                +"\n⅛ teaspoon black pepper"
                +"\n   4 eggs, lightly beaten"
                +"\n  Dash of ground red pepper"
                +"\n  Cooking spray"
                +"\n¼ cup chopped onion"
                +"\n 1 (2-ounce) can diced green chiles"
                +"\n 4 (6-inch) corn tortillas"
                +"\n½ cup (2 ounces) shredded colby-Jack cheese"

                +"\n\n   Directions"

                +"\nStep 1"

                +"\nTo prepare pico de gallo, combine first 7 ingredients in a small bowl."
                +"\n\nStep 2"

                +"\nTo prepare the burritos, combine chopped fresh oregano and the next 4 ingredients (through the ground red pepper) in a small bowl, stirring well with a whisk."
                +"\n\nStep 3"

                +"\nHeat a large nonstick skillet over medium heat. Coat the pan with cooking spray. Add egg mixture, 1/4 cup onion, and green chiles to the pan. Cook for 3 minutes or until eggs are set, stirring frequently. Remove pan from heat; stir egg mixture well."
                +"\nStep 4"

                +"\nHeat the corn tortillas according to package directions. Divide the egg mixture evenly among tortillas. Top each serving with 2 tablespoons shredded cheese and about 1/3 cup pico de gallo."

        ;
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);
    }
}