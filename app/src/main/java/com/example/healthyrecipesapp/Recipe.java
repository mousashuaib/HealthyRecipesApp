package com.example.healthyrecipesapp;

public class Recipe {
    private String name;
    private String mealType;
    private String dietPreference;
    private boolean isFavorite;
    private int imageResId;
    private String healthBenefits; // New field
    private double price;

    public Recipe(String name, String mealType, String dietPreference, boolean isFavorite, int imageResId, String healthBenefits,double price) {
        this.name = name;
        this.mealType = mealType;
        this.dietPreference = dietPreference;
        this.isFavorite = isFavorite;
        this.imageResId = imageResId;
        this.healthBenefits = healthBenefits;
        this.price = price;

    }
    public double getPrice() {
        return price;
    }
    public String getHealthBenefits() {
        return healthBenefits;
    }

    public int getImageResId() {
        return imageResId;
    }
    public String getDietPreference() {
        return dietPreference;
    }

    public void setDietPreference(String dietPreference) {
        this.dietPreference = dietPreference;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
}
