package com.example.android.lab02_lnteractive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    TextView quantityTextView;
    int qty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
    }

    public void submitOrder(View view) {
        switch (view.getId()){
            case R.id.button:
                qty++;
                quantityTextView.setText(qty + "");
                break;
            case R.id.button2:
                qty--;
                quantityTextView.setText(qty + "");
                break;
            case R.id.button3:
                display();
                break;
        }
    }

    private void display() {
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        int price = 5;
        int total = price * qty;
        String myString = NumberFormat.getCurrencyInstance(Locale.TAIWAN).format(total);
        priceTextView.setText(myString);
    }
}
