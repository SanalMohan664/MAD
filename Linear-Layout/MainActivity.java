package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText fn,ln,dob,pno,email,pwd;
    private Button b1;
    private String Firstname,Lastname,DOB,Phone,Mail,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fn=(EditText) findViewById(R.id.fn);
        ln=(EditText) findViewById(R.id.ln);
        dob=(EditText) findViewById(R.id.dob);
        pno=findViewById(R.id.pno);
        email=findViewById(R.id.email);
        pwd=findViewById(R.id.pwd);
        b1=(Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Firstname=fn.getText().toString();
                Lastname=ln.getText().toString();
                DOB=dob.getText().toString();
                Phone=pno.getText().toString();
                Mail=email.getText().toString();
                Password=pwd.getText().toString();

                if (Firstname.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Your First Name", Toast.LENGTH_SHORT).show();
                }
                else if (Lastname.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Your Last Name", Toast.LENGTH_SHORT).show();
                }
                else if (DOB.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Your Date of Birth", Toast.LENGTH_SHORT).show();
                }
                else if (Phone.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Your Phone Number", Toast.LENGTH_SHORT).show();
                }
                else if (Mail.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Your E-Mail ID", Toast.LENGTH_SHORT).show();
                }
                else if (Password.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Your Password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Registration Completed", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}
