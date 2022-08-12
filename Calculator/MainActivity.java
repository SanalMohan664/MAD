package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText t1;
    private EditText t2;
    private EditText t3;
    private Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.editTextTextPersonName2);
        t2=(EditText)findViewById(R.id.editTextTextPersonName3);
        t3=(EditText)findViewById(R.id.editTextTextPersonName4);

        b1=(Button)findViewById(R.id.button2);

    }
    public void  c1(View view){
    int n1 = Integer.parseInt(t1.getText().toString());
    int n2 = Integer.parseInt(t2.getText().toString());
    int r1 = n1+n2;
    t3.setText(Integer.toString(r1));
    }
    public void  c2(View view) {
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        int r1 = n1 - n2;
        t3.setText(Integer.toString(r1));
    }
    public void  c3(View view) {
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        int r1 = n1 * n2;
        t3.setText(Integer.toString(r1));
    }
    public void  c4(View view) {
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        int r1 = n1 / n2;
        t3.setText(Integer.toString(r1));
    }
}
