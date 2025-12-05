package com.example.hazi06;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hazi06.adapters.CurrencyAdapter;
import com.example.hazi06.models.CurrencyItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<CurrencyItem> currencyList = new ArrayList<>();

        currencyList.add(new CurrencyItem(R.drawable.euro, "EUR", "Euro", "4,4100 RON", "4,5500 RON"));
        currencyList.add(new CurrencyItem(R.mipmap.ic_launcher, "USD", "Dolar american", "3,9750 RON", "4,1450 RON"));
        currencyList.add(new CurrencyItem(R.mipmap.ic_launcher, "GBP", "Lira sterlina", "6,1250 RON", "6,3550 RON"));
        currencyList.add(new CurrencyItem(R.mipmap.ic_launcher, "AUD", "Dolar australian", "2,9600 RON", "3,0600 RON"));
        currencyList.add(new CurrencyItem(R.mipmap.ic_launcher, "HUF", "Forint maghiar", "0,0136 RON", "0,0146 RON"));

        CurrencyAdapter adapter = new CurrencyAdapter(this, currencyList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            CurrencyItem selectedItem = currencyList.get(position);

            String message = "Code: " + selectedItem.getCode() + ", Buy: " + selectedItem.getBuyPrice();
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        });


    }
}