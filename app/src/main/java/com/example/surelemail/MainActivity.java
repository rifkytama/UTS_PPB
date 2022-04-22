 package com.example.surelemail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images [] = {R.drawable.afuq,R.drawable.eko,R.drawable.ewing,R.drawable.hafizh,R.drawable.hanif,R.drawable.manok,R.drawable.nopal,R.drawable.tama,R.drawable.tegar,R.drawable.yaz};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Surel_Email);
        s2 = getResources().getStringArray(R.array.Description);

        Email email = new Email(this, s1, s2, images);
        recyclerView.setAdapter(email);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
    }
}