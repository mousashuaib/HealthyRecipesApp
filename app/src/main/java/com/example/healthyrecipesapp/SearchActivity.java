package com.example.healthyrecipesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private EditText searchEditText;
    private Spinner categorySpinner;
    private RadioGroup radioGroup;
    private CheckBox checkBoxFavorites;
    private Button btn2;
    private List<Recipe> recipes;
    private Recipe selectedRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Search for Healthy Recipes !");
        }

        searchEditText = findViewById(R.id.searchEditText);
        categorySpinner = findViewById(R.id.categorySpinner);
        radioGroup = findViewById(R.id.radioGroup);
        checkBoxFavorites = findViewById(R.id.checkBoxFavorites);
        btn2 = findViewById(R.id.btn2);

        recipes = MockData.getAllRecipes();

        List<String> recipeNames = new ArrayList<>();
        for (Recipe recipe : recipes) {
            recipeNames.add(recipe.getName());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, recipeNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(adapter);

        categorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedRecipe = recipes.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedRecipe = null;
            }
        });

        btn2.setOnClickListener(v -> {
            String mealType = searchEditText.getText().toString().trim();

            // Check if meal type and recipe name are specified
            if (mealType.isEmpty()) {
                Toast.makeText(SearchActivity.this, "Please specify a meal type (Dinner, Lunch, or Breakfast)", Toast.LENGTH_SHORT).show();
            } else if (selectedRecipe == null) {
                Toast.makeText(SearchActivity.this, "Please select a recipe", Toast.LENGTH_SHORT).show();
            } else if (!mealType.equalsIgnoreCase("dinner") && !mealType.equalsIgnoreCase("lunch") && !mealType.equalsIgnoreCase("breakfast")) {
                Toast.makeText(SearchActivity.this, "Meal type must be 'Dinner', 'Lunch', or 'Breakfast'", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(SearchActivity.this, FormForRecpieHealth.class);
                intent.putExtra("name", selectedRecipe.getName());
                intent.putExtra("imageResId", selectedRecipe.getImageResId());
                intent.putExtra("healthBenefits", selectedRecipe.getHealthBenefits());
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        searchEditText.setText("");
        radioGroup.clearCheck();
        categorySpinner.setSelection(0);
        selectedRecipe = null;
        checkBoxFavorites.setChecked(false);
    }
}
