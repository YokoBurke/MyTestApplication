package com.example.android.mytestapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Coffee> myCoffeeList;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCoffeeList = new ArrayList<>();
        myCoffeeList.add(new Coffee(1, "Latte"));
        myCoffeeList.add(new Coffee(5, "Espresso"));
        myCoffeeList.add(new Coffee(3, "Caramel Macchiato"));
        myCoffeeList.add(new Coffee(4, "Mild Coffee"));
        myCoffeeList.add(new Coffee(6, "Chocolate Milk"));
        myCoffeeList.add(new Coffee(7, "Domdom"));

        Log.i("MainActivity", Integer.toString(myCoffeeList.size()));



        recyclerView = (RecyclerView) findViewById(R.id.recyclethis);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);

        myAdapter = new MyAdapter(myCoffeeList);
        recyclerView.setAdapter(myAdapter);


    }
}
