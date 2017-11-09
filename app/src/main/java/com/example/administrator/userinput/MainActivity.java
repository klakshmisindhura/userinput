package com.example.administrator.userinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 2;

    public void increment(View view){
        quantity = quantity+1;
        display(quantity);
    }

    public void decrement(View view) {
        quantity = quantity-1;
        display(quantity);
    }

    public void submitOrder(View view){

        displayprice(quantity * 5);

    }

    private void display(int number){
        TextView quantityTextview= findViewById(R.id.quantity_text_view);
        quantityTextview.setText(" "+number);
    }
    private void displayprice(int number){
        TextView priceTextview = findViewById(R.id.price_text_view);
        priceTextview.setText(NumberFormat.getCurrencyInstance().format(number));

    }

}


