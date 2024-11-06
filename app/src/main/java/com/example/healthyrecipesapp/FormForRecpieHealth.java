package com.example.healthyrecipesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class FormForRecpieHealth extends AppCompatActivity {
    private static final ArrayList<Recipe> orderList = new ArrayList<>(); // Static list to store orders

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_for_recpie_health);

        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeName = findViewById(R.id.recipe_name);
        TextView healthBenefits = findViewById(R.id.recipe_health_benefits);
        Button orderButton = findViewById(R.id.order_button);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int imageResId = intent.getIntExtra("imageResId", 0);
        String benefits = intent.getStringExtra("healthBenefits");
        double price = getRecipePrice(name);

        recipeName.setText(name);
        recipeImage.setImageResource(imageResId);
        healthBenefits.setText(benefits + "\nPrice: $" + price); // Display price

        orderButton.setOnClickListener(v -> {
            orderList.add(new Recipe(name, "", "", true, imageResId, benefits, price));

            Intent orderIntent = new Intent(FormForRecpieHealth.this, OrderActivity.class);
            startActivity(orderIntent);
        });
    }

    private double getRecipePrice(String name) {
        List<Recipe> allRecipes = MockData.getAllRecipes();
        for (Recipe recipe : allRecipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                return recipe.getPrice();
            }
        }
        return 0.0;
    }

    public static ArrayList<Recipe> getOrderList() {
        return orderList;
    }
}
