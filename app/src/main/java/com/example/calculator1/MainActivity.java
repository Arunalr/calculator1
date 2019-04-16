package com.example.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView ans;
    Button add;
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View V) {
        num1 = (EditText) findViewById(R.id.txt1);
        num2 = (EditText) findViewById(R.id.txt2);
        ans = (TextView) findViewById(R.id.textView);
        add = (Button) findViewById(R.id.btn);
        int i = Integer.parseInt(num1.getText().toString());
        int j = Integer.parseInt(num2.getText().toString());
        int k = i + j;
        ans.setText(String.valueOf(k));
    }

    public void Substraction(View V) {
        num1 = (EditText) findViewById(R.id.txt1);
        num2 = (EditText) findViewById(R.id.txt2);
        ans = (TextView) findViewById(R.id.textView);
        sub = (Button) findViewById(R.id.btn2);
        int i = Integer.parseInt(num1.getText().toString());
        int j = Integer.parseInt(num2.getText().toString());
        int k = i - j;
        ans.setText(String.valueOf(k));

    }
}

