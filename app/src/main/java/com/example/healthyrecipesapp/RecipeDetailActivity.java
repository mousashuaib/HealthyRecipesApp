package com.example.healthyrecipesapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class RecipeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recipe_detail);

        Toolbar toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Search for Healthy Recipes !");
        }

        ListView listView = findViewById(R.id.favorites_list);

        List<Recipe> favoriteRecipes = MockData.searchRecipes(null, null, null, true);
        List<String> favoriteNamesWithPrice = new ArrayList<>();
        for (Recipe recipe : favoriteRecipes) {
            favoriteNamesWithPrice.add(recipe.getName() + " : $" + recipe.getPrice());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, favoriteNamesWithPrice);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Recipe selectedRecipe = favoriteRecipes.get(position);
            Intent intent = new Intent(RecipeDetailActivity.this, FormForRecpieHealth.class);
            intent.putExtra("name", selectedRecipe.getName());
            intent.putExtra("imageResId", selectedRecipe.getImageResId());
            intent.putExtra("healthBenefits", selectedRecipe.getHealthBenefits());

            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
