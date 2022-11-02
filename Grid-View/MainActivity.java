package com.example.grid_view_base_adapter;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView grid;

    int icons[]=
            {
                    R.drawable.bmw,
                    R.drawable.mercedes,
                    R.drawable.toyota,
                    R.drawable.porsche,
                    R.drawable.ferrari,
                    R.drawable.rollsroyce
            };
    String name[]={"BMW","MERCEDES","TOYOTA","PORSCHE","FERRARI","ROLLS ROYCE"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid=(GridView)findViewById(R.id.gridv);
        gridAdapter obj=new gridAdapter(this,name,icons);
        grid.setAdapter(obj);



    }
}
