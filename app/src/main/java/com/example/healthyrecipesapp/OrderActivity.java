package com.example.healthyrecipesapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        TextView orderListTextView = findViewById(R.id.order_list_textview);

        ArrayList<Recipe> orderList = FormForRecpieHealth.getOrderList();

        StringBuilder orderListDisplay = new StringBuilder("Your Orders:\n\n");
        double totalPrice = 0.0;

        for (Recipe recipe : orderList) {
            orderListDisplay.append(recipe.getName())
                    .append(" : $").append(recipe.getPrice()).append("\n");
            totalPrice += recipe.getPrice();
        }

        orderListDisplay.append("\nTotal Price: $").append(totalPrice);
        orderListTextView.setText(orderListDisplay.toString());
    }
}
