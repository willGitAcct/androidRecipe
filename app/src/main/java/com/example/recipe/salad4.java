package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class salad4 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad4);
        recipeString = "\n" +
                "Ingredients\n" +
                "For the Salad\n" +
                "\n" +
                "    1 cup quinoa, rinsed (or pre-washed)\n" +
                "    ½ teaspoon salt\n" +
                "    1 red bell pepper, cut into bite-sized strips\n" +
                "    1 carrot, peeled and grated\n" +
                "\n" +
                "    1 English cucumber, seeded and diced\n" +
                "    2 scallions, white and green parts, finely sliced\n" +
                "    ¼ cup freshly chopped cilantro\n" +
                "    2 tablespoons fresh chopped mint or basil (optional)\n" +
                "\n" +
                "For the Dressing\n" +
                "\n" +
                "    ¼ cup freshly squeezed lime juice, from 3-4 limes\n" +
                "    2½ teaspoons Asian fish sauce\n" +
                "    1½ tablespoons vegetable oil\n" +
                "    2 tablespoons sugar\n" +
                "    ¼ teaspoon crushed red pepper flakes (use less if you don't like heat)\n" +
                "\n" +
                "Instructions\n" +
                "\n" +
                "    Add quinoa, salt and 1⅔ cups water to a medium saucepan. Bring to a boil and then reduce heat to low, cover, and cook for 15 minutes, until the water is absorbed and the quinoa is cooked. You'll know it is done when the little \"tails\" sprout from the grains. (If necessary add 1-2 tablespoons more water if the quinoa is not cooked by the time all the liquid is absorbed.) Transfer to a serving bowl and let cool in the refrigerator.\n" +
                "    In the meantime, make the dressing by combining the lime juice, fish sauce, vegetable oil, sugar and crushed red pepper flakes in a medium bowl. Whisk until the sugar is dissolved.\n" +
                "    Once the quinoa is cool, add the red bell peppers, carrots, cucumbers, scallions, fresh herbs and dressing. Toss well, then taste and adjust seasoning with more salt, sugar and lime juice if necessary (I usually add a bit more of all). Chill in the refrigerator until ready to serve. This salad keeps well for several days in the fridge.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);
    }
}