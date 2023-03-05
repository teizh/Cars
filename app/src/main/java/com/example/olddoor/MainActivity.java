package com.example.olddoor;

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

        Button button = findViewById(R.id.enter);
        EditText editText = findViewById(R.id.email);
        EditText editText2 = findViewById(R.id.password);
        TextView textView=findViewById(R.id.welcome);
        TextView textView2=findViewById(R.id.logIn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text1 = editText.getText().toString();
                String text2 = editText2.getText().toString();

                textView.setText("Welcome " + text1);

                if (text2=="QWERTY123") {
                    textView2.setText("Password is correct");
                } else if (text2!=null) {
                    textView2.setText("Incorrect password");
                }
            }
        });








    }
}