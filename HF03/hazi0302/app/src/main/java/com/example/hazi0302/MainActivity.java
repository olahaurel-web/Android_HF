package com.example.hazi0302;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button cancelButton;
    Button addProduct;
    Button submitButton;

    EditText productName;

    EditText productCode;

    EditText productPrice;

    TextView resultText;


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



        cancelButton = findViewById(R.id.cancel);
        addProduct = findViewById(R.id.addProduct);
        submitButton = findViewById(R.id.submitButton);

        productName = findViewById(R.id.productName);
        productCode = findViewById(R.id.productCode);
        productPrice = findViewById(R.id.productPrice);

        resultText = findViewById(R.id.resultText);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = productName.getText().toString().trim();
                String code = productCode.getText().toString().trim();
                String priceText = productPrice.getText().toString().trim();


                if (name.isEmpty() || code.isEmpty() || priceText.isEmpty()) {
                    resultText.setText("All fields are required!");
                    return;
                }

                float price;
                try {
                    price = Float.parseFloat(priceText);
                } catch (NumberFormatException e) {
                    resultText.setText("Invalid price format!");
                    return;
                }


                Product termek = new Product(price, code, name);


                @SuppressLint("DefaultLocale") String termekAdatok = String.format(
                        "Name: %s\nCode: %s\nPrice: %.2f $",
                        termek.getName(),
                        termek.getCode(),
                        termek.getPrice()
                );

                resultText.setText(termekAdatok);
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productName.setText("");
                productCode.setText("");
                productPrice.setText("");
                resultText.setText("");
            }
        });
    }

}