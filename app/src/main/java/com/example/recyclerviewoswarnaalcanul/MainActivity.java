package com.example.recyclerviewoswarnaalcanul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447", "Piter", "Tabasco", "Activo"));
        elements.add(new ListElement("#607d8b", "Paco", "Sinaloa", "Activo"));
        elements.add(new ListElement("#03a9f4", "Maria", "Poza Rica", "Cancelado"));
        elements.add(new ListElement("#f44336", "Mario", "CDMX", "Cancelado"));
        elements.add(new ListElement("#009688", "Oswar", "Jose Maria Morelos", "Activo"));
        elements.add(new ListElement("#572364", "Samuel", "Mexico", "Activo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}