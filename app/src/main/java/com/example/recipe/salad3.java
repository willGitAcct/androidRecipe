package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class salad3 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad3);
        recipeString = "\nCAPRESE SALAD WITH BALSAMIC GLAZE" +
                "Ingredients\n" +
                "\n" +
                "    3 heirloom or vine-ripened tomatoes, cut into ¼-inch slices\n" +
                "    ½ teaspoon sugar\n" +
                "    ½ teaspoon salt, divided\n" +
                "    1 pound fresh mozzarella, cut into ¼-inch slices (pre-sliced is fine)\n" +
                "    Freshly ground black pepper, to taste\n" +
                "    Extra virgin olive oil, for drizzling\n" +
                "    Balsamic glaze (store-bought), for drizzling\n" +
                "    ¼ cup roughly chopped fresh basil, plus more whole sprigs to garnish the platter\n" +
                "\n" +
                "Instructions\n" +
                "\n" +
                "    Arrange the tomato slices on a cutting board. Sprinkle with sugar and ¼ teaspoon of the salt and let sit for a few minutes until the sugar dissolves.\n" +
                "    Arrange the sliced tomatoes on a serving platter, alternating with the sliced mozzarella. Sprinkle evenly with the remaining ¼ teaspoon of salt and freshly ground black pepper. Drizzle about 1 tablespoon of olive oil over top, followed by an equal amount of the balsamic glaze (it's fine to just eyeball it). Scatter the roughly chopped basil over top. Garnish the platter with sprigs of fresh basil, if desired.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);
    }
}