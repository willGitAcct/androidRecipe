package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class salad2 extends AppCompatActivity {
    TextView recipeText;
    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad2);

        recipeString = "\nGRILLED ASPARAGUS SALAD WITH FETA AND LEMON" +
                "Ingredients\n" +
                "\n" +
                "    2 pounds very thick asparagus, about 24 spears, ends trimmed\n" +
                "    3 tablespoons extra virgin olive oil, divided\n" +
                "    ¼ teaspoon salt\n" +
                "    ¼ teaspoon freshly ground black pepper\n" +
                "    Zest of 1 lemon\n" +
                "    1 tablespoon freshly squeezed lemon juice, from one lemon\n" +
                "    3 oz feta cheese, crumbled (about ¾ cup)\n" +
                "\n" +
                "Instructions\n" +
                "\n" +
                "    Preheat the grill to high.\n" +
                "    Place the asparagus spears on a foil-lined baking sheet for easy clean-up. Directly on the prepared baking sheet, toss the asparagus with 2 tablespoons of the oil, the salt and the pepper.\n" +
                "    Place the asparagus spears on the grill, making sure they are perpendicular to grates so they don't fall through. Set the baking sheet near the grill (you'll need it for the cooked asparagus). Cover and cook the asparagus for 3 to 4 minutes, until nicely browned on one side and still crisp -- do not overcook. Remove the asparagus from the grill and place back on the foil-lined baking dish. Let the asparagus cool.\n" +
                "    Transfer the spears to cutting board and cut on the bias into bite-sized pieces. Place the cut asparagus in a mixing bowl. Add the remaining tablespoon olive oil, lemon zest and lemon juice; toss well. Add the feta and toss gently. Taste and adjust seasoning with more salt, pepper and lemon juice (I usually add up to ¼ teaspoon more salt). Transfer to a serving platter. Serve room temperature or cold.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);
    }
}