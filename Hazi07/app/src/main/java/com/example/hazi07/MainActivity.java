package com.example.hazi07;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hazi07.adapters.AnimalAdapter;
import com.example.hazi07.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Macska", "Description", R.drawable.cat));
        animals.add(new Animal("Diszno", "Description", R.mipmap.ic_launcher));
        animals.add(new Animal("Kutya", "Description", R.mipmap.ic_launcher));
        animals.add(new Animal("Zsiraf", "Description", R.mipmap.ic_launcher));
        animals.add(new Animal("Lo", "Description", R.mipmap.ic_launcher));
        animals.add(new Animal("Oroszlan", "Description", R.mipmap.ic_launcher));
        animals.add(new Animal("Nyul", "Description", R.mipmap.ic_launcher));
        animals.add(new Animal("Barany", "Description", R.mipmap.ic_launcher));

        AnimalAdapter adapter = new AnimalAdapter(animals);

        recyclerView.setAdapter(adapter);

    }
}