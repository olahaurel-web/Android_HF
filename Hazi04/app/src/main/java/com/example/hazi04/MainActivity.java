package com.example.hazi04;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private int lastClickedPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView listView = findViewById(R.id.listView);




        List<Currency> currencies = new ArrayList<>();

        currencies.add(new Currency("EUR", "Euro", 4.75, 4.35, R.drawable.euro));

        CurrencyAdapter adapter = new CurrencyAdapter(this, currencies);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(((parent, view, position, id) -> {
            Currency clickedCurrency = currencies.get(position);

            TextView buyrate = findViewById(R.id.buyRate);
            TextView sellrate = findViewById(R.id.sellRate);
            buyrate.setAlpha(1);
            sellrate.setAlpha(1);

        }));



    }



}