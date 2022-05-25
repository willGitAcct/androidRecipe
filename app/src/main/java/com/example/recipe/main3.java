package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class main3 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recipeString = "Homemade Mac n Cheese\n\nIngredients\n" +
                "4\n" +
                "Original recipe yields 4 servings\n" +
                "Ingredient Checklist\n" +
                "\n" +
                "    8 ounces uncooked elbow macaroni\n" +
                "    ¼ cup butter\n" +
                "    2 ½ tablespoons all-purpose flour\n" +
                "    3 cups milk\n" +
                "    2 cups shredded sharp Cheddar cheese\n" +
                "    ½ cup grated Parmesan cheese\n" +
                "    2 tablespoons butter\n" +
                "    ½ cup bread crumbs\n" +
                "    1 pinch paprika\n" +
                "\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "\n" +
                "    Step 1\n" +
                "\n" +
                "    Preheat the oven to 350 degrees F (175 degrees C).\n" +
                "    Step 2\n" +
                "\n" +
                "    Cook macaroni according to the package directions. Drain.\n" +
                "    Step 3\n" +
                "\n" +
                "    Melt butter in a medium skillet over low heat. Gradually add flour, whisking until well combined. Slowly pour in milk, whisking constantly until smooth. Stir in cheeses, and cook over low heat until cheese is melted and the sauce is a little thick. Put macaroni in large casserole dish, and pour sauce over macaroni. Stir well.\n" +
                "    Step 4\n" +
                "\n" +
                "    Melt butter in a skillet over medium heat. Add breadcrumbs and brown. Spread over the macaroni and cheese to cover. Sprinkle with a little paprika.\n" +
                "    Step 5\n" +
                "\n" +
                "    Bake in the preheated oven for 30 minutes. Serve.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}