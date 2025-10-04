package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView cimkeView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button osszeadas = findViewById(R.id.osszeadas);
        Button kivonas = findViewById(R.id.kivonas);
        Button szorzas = findViewById(R.id.szorzas);
        Button osztas = findViewById(R.id.osztas);

        Button btn = findViewById(R.id.nextpage);

        TextView eredmeny = findViewById(R.id.eredmeny);
        cimkeView = findViewById(R.id.cimke);


        EditText editSzoveg = findViewById(R.id.editTextText3);
        EditText editSzoveg2 = findViewById(R.id.editTextText2);



        cimkeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cimkeView.append("\n" + cimkeView.getText());
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);

                startActivity(myIntent);

            }
        });


        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String input1 = editSzoveg.getText().toString();
                    String input2 = editSzoveg2.getText().toString();

                    float number1 = Float.parseFloat(input1);
                    float number2 = Float.parseFloat(input2);

                    float result = number1 + number2;

                    eredmeny.setText(String.valueOf(result));

                } catch (NumberFormatException e) {
                    //eredmeny.setText("hiba!");
                    Toast toast = Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String input1 = editSzoveg.getText().toString();
                    String input2 = editSzoveg2.getText().toString();

                    float number1 = Float.parseFloat(input1);
                    float number2 = Float.parseFloat(input2);

                    float result = number1 - number2;

                    eredmeny.setText(String.valueOf(result));


                } catch (NumberFormatException e) {
                    //eredmeny.setText("hiba!");
                    Toast toast = Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String input1 = editSzoveg.getText().toString();
                    String input2 = editSzoveg2.getText().toString();

                    float number1 = Float.parseFloat(input1);
                    float number2 = Float.parseFloat(input2);

                    if (number2 == 0 || number1 == 0) {
                        Toast toast = Toast.makeText(MainActivity.this, "0-val valo osztas nem lehetseges!", Toast.LENGTH_SHORT);
                        toast.show();
                        return;
                    }


                    float result = number1 / number2;



                    eredmeny.setText(String.valueOf(result));

                } catch (NumberFormatException e) {
                    //eredmeny.setText("hiba!");
                    Toast toast = Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String input1 = editSzoveg.getText().toString();
                    String input2 = editSzoveg2.getText().toString();

                    float number1 = Float.parseFloat(input1);
                    float number2 = Float.parseFloat(input2);

                    float result = number1 * number2;

                    eredmeny.setText(String.valueOf(result));

                } catch (NumberFormatException e) {
                    //eredmeny.setText("hiba!");
                    Toast toast = Toast.makeText(MainActivity.this, "Hiba", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("cimke", cimkeView.getText().toString());
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        cimkeView.setText(savedInstanceState.getString("cimke"));
    }


    /* LOGCAT */
    @Override
    protected void onRestart() {
        super.onRestart();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}