package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText first_number = findViewById(R.id.first_number);
        EditText second_number = findViewById(R.id.second_number);
        EditText Finals_30 = findViewById(R.id.Finals_30);
        EditText Mid_terms_30 = findViewById(R.id.Mid_terms_30);
        Button Reset = findViewById(R.id.Reset);
        Button calculate = findViewById(R.id.calculate);
        TextView total = findViewById(R.id.total);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(first_number.getText().toString());
                int n2 = Integer.parseInt(second_number.getText().toString());
                int n3 = Integer.parseInt(Finals_30.getText().toString());
                int n4 = Integer.parseInt(Mid_terms_30.getText().toString());
                total.setText(Integer.toString(n1 + n2 + n3 + n4));


            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first_number.setText(null);
                first_number.dispatchDisplayHint(View.VISIBLE);
                second_number.setText(null);
                second_number.dispatchDisplayHint(View.VISIBLE);
                Mid_terms_30.setText(null);
                Mid_terms_30.dispatchDisplayHint(View.VISIBLE);
                Finals_30.setText(null);
                Finals_30.dispatchDisplayHint(View.VISIBLE);
                total.setText(null);
                total.dispatchDisplayHint(View.VISIBLE);
            }
        });

    }
}