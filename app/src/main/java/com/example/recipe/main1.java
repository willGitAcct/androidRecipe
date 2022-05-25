package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class main1 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        recipeString = "Pasta Arrabiata\n\n" +
                "Ingredients\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "    4 teaspoons minced garlic (about 5 cloves)\n" +
                "    ¼ cup olive oil\n" +
                "    1 (28-ounce) can petite diced tomatoes, undrained\n" +
                "    1 (29-ounce) can tomato puree\n" +
                "    2 teaspoons crushed red pepper flakes\n" +
                "    1 teaspoon sugar\n" +
                "    ½ teaspoon dried oregano\n" +
                "    ¼ teaspoon salt\n" +
                "    1 teaspoon lemon juice\n" +
                "    1 (16-ounce) box penne pasta\n" +
                "    ½ cup freshly shredded Parmigiano-Reggiano cheese blend*\n" +
                "    ¼ cup thinly sliced fresh basil\n" +
                "    Garnishes: Parmigiano-Reggiano cheese shavings, fresh basil sprigs\n" +
                "\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "\n" +
                "    Step 1\n" +
                "\n" +
                "    Sauté garlic in hot oil in a 6-quart saucepan over medium heat 1 minute. Add tomatoes and tomato puree. Bring to a boil; reduce heat to low. Stir in red pepper flakes and next 4 ingredients; cook, stirring occasionally, 20 minutes.\n" +
                "    Step 2\n" +
                "\n" +
                "    Prepare pasta in a large Dutch oven according to package directions. Drain, reserving 1/2 cup cooking liquid. Return pasta and reserved cooking liquid to Dutch oven, and sprinkle with shredded cheese.\n" +
                "    Step 3\n" +
                "\n" +
                "    Stir basil into tomato sauce, and pour 3 cups sauce over pasta. Toss to coat. Serve with remaining sauce. Garnish, if desired.\n" +
                "    Step 4\n" +
                "\n" +
                "    *1/2 cup freshly grated Parmesan cheese may be substituted.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}