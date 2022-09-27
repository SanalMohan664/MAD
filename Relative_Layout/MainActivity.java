package com.example.facebookpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        et1=(EditText)findViewById(R.id.uname);
        et2=(EditText)findViewById(R.id.password);
    }
    public void login(View view){
        String un=et1.getText().toString().trim();
        String pass=et2.getText().toString().trim();

        if(un.equals("")){
            Toast.makeText(this,"Enter your Phone or Email" ,Toast.LENGTH_SHORT).show();
        }
        else if(pass.equals("")){
            Toast.makeText(this,"Enter your password",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent in=new Intent(this, MainActivity2.class);
            startActivity(in);
        }
    }
}
