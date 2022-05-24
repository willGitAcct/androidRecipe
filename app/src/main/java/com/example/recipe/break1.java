package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class break1 extends AppCompatActivity {
    TextView recipeText;

    String recipeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break1);
        recipeString = "BREAKFAST SMOOTHIE BOWL"
                + "\n\n1/4 ripe avocado\n"
                +"2 medium ripe bananas (previously sliced and frozen)\n"
                +"1 cup fresh or frozen mixed berries (organic when possible // use strawberries/raspberries for a greener smoothie, darker berries for a purple smoothie)\n"
                +"      2 large handfuls spinach (organic when possible)\n"
                +"\n1 small handful kale (organic when possible // large stems removed)"
                +"\n1 1/2 – 2 cups unsweetened non-dairy milk (DIY or store-bought – will depend on if your berries are frozen)"
                +"\n1 Tbsp flaxseed meal"
                +"\n2 Tbsp salted creamy almond or peanut butter (optional)"

                +"\n\nTOPPINGS (optional)"

                +"\nRoasted unsalted sunflower seeds"
                +"\nGranola"
                +"\nRaw or roasted nuts (almonds, pecans, walnuts, etc.)"
                +"\nShredded unsweetened coconut"
                +"\nFresh berries"
                +"\nHemp seeds"

                +"\n\nInstructions"

                +"\nAdd all smoothie ingredients to a blender and blend until creamy and smooth. Add more almond milk (or water) to thin."
                +"\nTaste and adjust flavor as needed, adding more ripe banana (or maple syrup) for added sweetness, more spinach for a bright green hue, or almond milk for creaminess."
                +"\nFor the green smoothie, I used strawberries, which let the green color come through more. For the purple bowl, I used darker berries (raspberries, blackberries, blueberries)."
                +"\nFor more protein, add nut butter! This also offsets / enhances the natural sweetness of the smoothie."
                +"\nDivide between 2 serving bowls (as original recipe is written // adjust if altering batch size) and top with desired toppings!"
                +"\nBest when fresh, though leftovers can be kept in jars in the fridge for up to 1-2 days.";
        recipeText = (TextView) findViewById(R.id.recipeText);
        recipeText.setText(recipeString);


    }
}