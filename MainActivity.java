package com.example.just_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t0;
    Button t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(Button)findViewById(R.id.b1);
        t2=(Button)findViewById(R.id.b2);
        t3=(Button)findViewById(R.id.b3);
        t4=(Button)findViewById(R.id.b4);
        t5=(Button)findViewById(R.id.b5);
        t6=(Button)findViewById(R.id.b6);
        t7=(Button)findViewById(R.id.b7);
        t8=(Button)findViewById(R.id.b8);
        t0=(TextView)findViewById(R.id.e1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=t1.getText().toString();
                t0.setText(s);
            }
        });



    }
}