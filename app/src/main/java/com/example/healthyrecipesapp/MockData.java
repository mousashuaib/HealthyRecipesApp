package com.example.healthyrecipesapp;

import java.util.ArrayList;
import java.util.List;

public class MockData {
    private static final List<Recipe> recipes = new ArrayList<>();

    static {
        recipes.add(new Recipe(" Pancakes", "Breakfast", "Vegetarian", true, R.drawable.pancake,
                "Rich in fiber and potassium. Bananas are an excellent source of vitamins and minerals, particularly vitamin C and vitamin B6, which support overall health and improve heart function.",10.2));

        recipes.add(new Recipe("Salmon", "Dinner", "Non-Vegetarian", true, R.drawable.salamon,
                "High in omega-3 fatty acids. Salmon is known to support heart health, reduce inflammation, and is also a great source of protein, making it an excellent choice for muscle recovery.",22.43));

        recipes.add(new Recipe("Vegetable Stir-Fry", "Lunch", "Vegetarian", true, R.drawable.vegetable_stir_fry,
                "Packed with vitamins and antioxidants. This dish combines a variety of colorful vegetables, providing essential nutrients and promoting healthy digestion.",22));

        recipes.add(new Recipe("Chicken Salad", "Lunch", "Non-Vegetarian", true, R.drawable.chicken_salad,
                "A balanced meal with protein and fiber. Chicken is a lean protein that supports muscle growth, while the salad greens are high in fiber and vitamins.",23.3));

        recipes.add(new Recipe("pasta", "Dinner", "Vegetarian", true, R.drawable.pasta_primavera,
                "A complete protein source. Quinoa contains all nine essential amino acids, making it an excellent plant-based protein option, while black beans add fiber and iron.",100.00));

        recipes.add(new Recipe("Fruit Smoothie", "Snack", "Vegetarian", true, R.drawable.protein_smoothie,
                "Rich in vitamins and hydration. This smoothie can be made with a variety of fruits, providing antioxidants, vitamins, and hydration to support skin health.",503.3));

        recipes.add(new Recipe("macarona", "Dinner", "Vegetarian", true, R.drawable.macarona,
                "Simple and nutritious. Made with olive oil and garlic, this dish is a great source of healthy fats and antioxidants that can improve heart health.",5.99));

        recipes.add(new Recipe("Egg", "Breakfast", "Vegetarian", true, R.drawable.egg,
                "High in healthy fats and protein. Avocados are packed with monounsaturated fats that can lower cholesterol, and eggs provide high-quality protein and essential nutrients.",12.99));

        recipes.add(new Recipe("Meat", "Dinner", "Non-Vegetarian", true, R.drawable.meat,
                "Rich in iron and protein. Beef is an excellent source of heme iron, which is more easily absorbed by the body, and it helps support muscle mass and strength.",60.99));

        recipes.add(new Recipe("Humos", "Lunch", "Vegetarian", true, R.drawable.humos,
                "High in fiber and plant protein. Chickpeas are great for digestive health and can help keep you feeling full longer, making them a fantastic addition to any meal.",18.50));

        recipes.add(new Recipe("Mango", "Dessert", "Vegetarian", true, R.drawable.manga,
                "Packed with omega-3 fatty acids and vitamins. Chia seeds are high in fiber and protein, while mango adds vitamin C and aids digestion.",40.99));

        recipes.add(new Recipe("Grilled Cheese Sandwich", "Snack", "Vegetarian", true, R.drawable.cheesesandwich,
                "Classic comfort food that's rich in calcium. Cheese provides protein and calcium, essential for bone health, while whole-grain bread adds fiber.", 8.75));

        recipes.add(new Recipe("Caesar Salad", "Lunch", "Vegetarian", true, R.drawable.caesar,
                "Light and nutritious. This salad is packed with fiber from lettuce and healthy fats from olive oil in the dressing.", 15.20));

        recipes.add(new Recipe("Tuna Sushi Roll", "Dinner", "Non-Vegetarian", true, R.drawable.tuna,
                "High in lean protein and omega-3s. Tuna helps support muscle health, and seaweed is rich in vitamins and minerals.", 25.50));

        recipes.add(new Recipe("Apple Pie", "Dessert", "Vegetarian", true, R.drawable.apple,
                "A classic dessert rich in fiber and antioxidants. Apples add natural sweetness and are great for heart health.", 12.00));

        recipes.add(new Recipe("Chocolate Protein Shake", "Snack", "Vegetarian", true, R.drawable.choco,
                "Perfect for recovery after a workout. This shake provides protein and a good source of energy.", 10.99));

        recipes.add(new Recipe("Greek Yogurt with Berries", "Breakfast", "Vegetarian", true, R.drawable.greekyogurt,
                "High in probiotics and antioxidants. Greek yogurt supports gut health, and berries add vitamin C.", 7.45));

        recipes.add(new Recipe("Mushroom Risotto", "Dinner", "Vegetarian", true, R.drawable.mush,
                "Creamy and packed with flavor. Mushrooms add B vitamins and antioxidants, supporting the immune system.", 18.25));

    }

    // Method to retrieve all recipes
    public static List<Recipe> getAllRecipes() {
        return new ArrayList<>(recipes);
    }

    public static List<Recipe> searchRecipes(String name, String mealType, String dietPreference, boolean favoritesOnly) {
        List<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            boolean matchesName = name == null || recipe.getName().toLowerCase().contains(name.toLowerCase());
            boolean matchesMealType = mealType == null || recipe.getMealType().equalsIgnoreCase(mealType);
            boolean matchesDietPreference = dietPreference == null || recipe.getDietPreference().equalsIgnoreCase(dietPreference);
            boolean matchesFavorites = !favoritesOnly || recipe.isFavorite();

            if (matchesName && matchesMealType && matchesDietPreference && matchesFavorites) {
                filteredRecipes.add(recipe);
            }
        }
        return filteredRecipes;
    }
}
