package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class salad1 extends AppCompatActivity {
    TextView recipeText;
    String recipeString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad1);

        recipeString = "BLACK BEAN AND CORN SALAD"

        +"\nIngredients"
                +"\nFor the Salad"

                +"\n 2 ears fresh corn"
                +"\n  1 cup chopped red onion"
                +"\n  1 (14.5 oz) can black beans"
                +"\n  1 red bell pepper, diced (about 1 cup)"
                +"\n ½ cup loosely packed fresh chopped cilantro (plus a bit more for garnish, if desired)"
                +"\n 1 avocado"

                +"\n\n For the Dressing"

                +"\n\n  2 tablespoons red wine vinegar"
                +"\n2 tablespoons fresh lime juice, from 1-2 limes"
                +"\n  2 tablespoons honey"
                +"\n ¼ cup plus 2 tablespoons vegetable oil"
                +"\n  1 large garlic clove, roughly chopped"
                +"\n¼ teaspoon dried oregano"
                +"\n¾ teaspoon cumin"
                +"\n¾ teaspoon salt"
                +"\n¼ teaspoon black pepper"
                +"\n2 canned chipotle peppers in adobo sauce (2 peppers, not 2 cans; use smaller peppers and if they are all large, use only 1½)"

                +"\n\nInstructions"

                +"\n\nBring a large pot of salted water to a boil. Add the corn, cover, and turn the heat down to low. Simmer for 10 minutes. Remove the corn from the water and let cool."
                +"\n Meanwhile, place the chopped red onions in a small bowl and cover with water. Let sit about ten minutes, then drain completely in a sieve and set aside."
                +"\nPlace the beans in a sieve; run under cold water to rinse well. Let drain completely and set aside."
                +"\nHolding the cooled corn upright in a large bowl, cut the kernels off the cob in strips. Add the beans, red onion, red bell pepper and cilantro."
                +"\nMake the dressing by combining all of the ingredients in a blender or mini food processor; process until smooth."
                +"\n Pour the dressing over the salad and toss well. Cover and refrigerate for at least 1 hour or, preferably, overnight."
                +"\nRight before serving, slice the avocado in half. Remove the pit; using a butter knife, cut a grid in each half.\nHolding the avocado halves over the salad, use a spoon to scoop out the diced flesh. Toss the salad gently, then taste and adjust seasoning if necessary (I usually add a squeeze of fresh lime to freshen it up). \nGarnish with a bit of fresh chopped cilantro if desired. Serve cold."

        ;
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);
    }
}