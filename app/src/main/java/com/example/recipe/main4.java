package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class main4 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        recipeString = "Pan con Milanesa\n\nIngredients\n" +
                "\n" +
                "    6 large veal cutlets 1- 1 1/2 pounds total\n" +
                "    salt and pepper to taste\n" +
                "    1/2 cup all-purpose flour\n" +
                "    1- 1 1/4 cups dry bread crumbs\n" +
                "    2 large eggs\n" +
                "    1/4 cup unsalted butter\n" +
                "    1/2 cup vegetable oil\n" +
                "    4-6 large crusty rolls French Rolls, Bolillos, Small Ciabatta Rolls\n" +
                "\n" +
                "For Serving:\n" +
                "\n" +
                "    Mayonnaise\n" +
                "    Mustard\n" +
                "    Romaine lettuce\n" +
                "    1 beefsteak or heirloom tomato thinly sliced\n" +
                "    Hot sauce\n" +
                "    Lime wedges\n" +
                "\n" +
                "Instructions\n" +
                "\n" +
                "    Preheat oven to 300˚F. Place 1-2 wire racks on a large rimmed baking sheet and lightly oil.\n" +
                "    Place a veal cutlet between 2 sheets of plastic wrap. Pound until 1/4 inch thick and season both sides with salt and pepper. Repeat with remaining cutlets.\n" +
                "    On one rimmed plate, spread out flour. On another rimmed plate, spread out bread crumbs. In a shallow bowl, beat eggs with 1 tablespoon of water.\n" +
                "    Coat one cutlet in the flour. Shake off any excess, coat with the egg, then completely with the breadcrumbs. Repeat with remaining cutlets and let them rest for 10-20 minutes.\n" +
                "    In a deep 12 inch skillet, melt butter and oil over medium high heat. Once thoroughly heated, fry cutlets until golden on each side, 2-3 minutes per side. Adjust the heat as needed between medium low and medium high. Fry the cutlets in batches to prevent overcrowding. Once golden, remove to prepared wire racks. Bake until cooked through, 12-15 minutes.\n" +
                "    Slice the rolls in half lengthwise. Spread mayonnaise and mustard on the bottom half. Cover with romaine lettuce, cooked cutlets, then sliced tomato. If desired, serve with hot sauce and lime wedges.";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}