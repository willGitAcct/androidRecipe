package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class dessert3 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert3);
        recipeString = "Eclair Cake with Chocolate Ganache\n\nIngredients\n" +

                "Original recipe yields 12 servings\n" +
                "Pastry Shell:\n" +
                "\n" +
                "    1 cup water\n" +
                "    ½ cup butter\n" +
                "    ¼ teaspoon salt\n" +
                "    1 cup all-purpose flour\n" +
                "    4 eggs\n" +
                "\n" +
                "Filling:\n" +
                "\n" +
                "    2 cups cold heavy whipping cream\n" +
                "    2 tablespoons confectioners' sugar\n" +
                "    1 teaspoon vanilla extract\n" +
                "    2 (3.5 ounce) packages instant vanilla pudding mix\n" +
                "    2 cups cold milk\n" +
                "\n" +
                "Chocolate Ganache:\n" +
                "\n" +
                "    1 cup bittersweet chocolate, chopped\n" +
                "    1 cup heavy cream\n" +
                "\n" +
                "Directions\n" +
                "Instructions Checklist\n" +
                "\n" +
                "    Step 1\n" +
                "\n" +
                "    Preheat an oven to 400 degrees F (200 degrees C). Grease a 9x13-inch baking dish. Place a mixing bowl in the freezer to chill.\n" +
                "    Step 2\n" +
                "\n" +
                "    Combine the water, butter, and salt in a medium saucepan and bring to a boil over medium-high heat. Reduce the heat to medium and stir in the flour. Cook and stir until the mixture pulls away from the sides of the pan and forms a ball. Transfer the mixture to a mixing bowl and beat in the eggs, one at a time, until fully incorporated. Spread the dough evenly in the bottom of the baking dish.\n" +
                "    Step 3\n" +
                "\n" +
                "    Bake the pastry in the preheated oven until golden brown, 25 to 30 minutes. (The dough will rise and make a boat shape, but should drop as it cools.) Cool completely on wire rack.\n" +
                "    Step 4\n" +
                "\n" +
                "    Remove the chilled mixing bowl from the freezer and pour in 2 cups of cold whipping cream. Whip until the cream thickens, about 1 minute; stir in the confectioners' sugar and the vanilla extract. Continue to whip until the cream forms stiff peaks. Refrigerate the whipped cream while you mix the pudding.\n" +
                "    Step 5\n" +
                "\n" +
                "    Pour the pudding mixes and the milk into a mixing bowl and stir until creamy. Fold in the whipped cream. Spread the filling over the cooled crust and refrigerate.\n" +
                "    Step 6\n" +
                "\n" +
                "    Place the chopped chocolate in a heat-proof bowl. Bring 1 cup of cream almost to a boil in a small saucepan over medium heat. Pour the hot cream over the chocolate and allow it to soften for 1 minute. Whisk the mixture until smooth. Let the mixture cool slightly to thicken, about 10 minutes. Pour the ganache over the cream filling, spreading to cover the entire surface. Return the pan to the refrigerator and chill for at least 1 hour before serving.\n" +
                "\n";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}