package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class dessert1 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert1);
        recipeString = "Creamy Flan\n\nIngredients\n" +
                "  \n" +
                "\n" +
                "    3/4 cup sugar\n" +
                "    1 8 ounces package cream cheese softened\n" +
                "    5 large eggs\n" +
                "    1 can sweetened condensed milk 14 ounces\n" +
                "    1 can evaporated milk 12 ounces\n" +
                "    1 teaspoon vanilla extract\n" +
                "\n" +
                "Instructions\n" +
                " \n" +
                "\n" +
                "    In a heavy saucepan, cook and stir sugar over medium-low heat until melted and golden, about 15 minutes.\n" +
                "    Quickly pour into an ungreased 2-qt. round baking or souffle dish, tilting to coat the bottom; let stand for 10 minutes.\n" +
                "    In a bowl, beat the cream cheese until smooth.\n" +
                "    Beat in eggs, one at a time, until thoroughly combined.\n" +
                "    Add remaining ingredients; mix well.\n" +
                "    Pour over caramelized sugar.\n" +
                "    Place the dish in a larger baking pan.\n" +
                "    Pour boiling water into larger pan to a depth of 1 in. Bake at 350° for 50-60 minutes or until center is just set (mixture will jiggle).\n" +
                "    Remove dish from a larger pan to a wire rack; cool for 1 hour.\n" +
                "    Refrigerate overnight.\n" +
                "    To unmold, run a knife around edges and invert onto a large rimmed serving platter.\n" +
                "    Cut into wedges or spoon onto dessert plates; spoon sauce over each serving.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}