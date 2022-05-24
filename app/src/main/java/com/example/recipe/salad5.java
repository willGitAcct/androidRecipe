package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class salad5 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad5);
        recipeString = "\nROASTED PEPPER SALAD WITH PIMENTO" +
                "Ingredients\n" +
                "\n" +
                "    4 bell peppers (any combination of red, yellow or orange), halved, seeded and cored\n" +
                "    2 tablespoons extra virgin olive oil\n" +
                "    2 teaspoons red wine vinegar\n" +
                "    1 small garlic clove, minced\n" +
                "    3 tablespoons chopped fresh basil, divided\n" +
                "    ½ teaspoon dried oregano\n" +
                "    1 teaspoon sugar\n" +
                "    ¾ teaspoon salt\n" +
                "    ⅛ teaspoon freshly ground black pepper\n" +
                "    3 tablespoons pine nuts\n" +
                "    2 ounces (a scant ½ cup) crumbled Feta\n" +
                "    ⅓ cup pitted kalamata olives\n" +
                "\n" +
                "Instructions\n" +
                "\n" +
                "    Set an oven rack in the top position and preheat the broiler. Line a baking sheet with aluminum foil. Place the pepper halves on the prepared baking sheet and broil for 5-10 minutes, rotating the pan once, until well charred. Remove the peppers from the oven and place in a bowl; cover tightly with plastic wrap (so they steam) and let cool until luke warm.\n" +
                "    Peel the skin from the peppers (do not rinse under water) and cut into ¾-inch strips. Place back in the bowl; add the olive oil, red wine vinegar, garlic, 2 tablespoons of the basil, oregano, sugar, salt and pepper. Refrigerate for at least one hour or overnight.\n" +
                "    Heat a small skillet over medium heat. Add the pine nuts and cook, stirring frequently, until golden, about 4 minutes. Immediately transfer the nuts to a small bowl to stop the cooking process. (Pay close attention: they go from perfectly golden to burnt quickly.)\n" +
                "    Transfer the marinated peppers to a serving dish and top with the feta, olives, toasted pine nuts and remaining tablespoon basil (do not toss). Garnish with whole basil leaves if desired.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);
    }
}