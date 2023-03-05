package com.geektech.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         CardView cardView = findViewById(R.id.card_view);
         cardView.setBackgroundResource(R.drawable.bg_card_view);

        LinearLayout container = findViewById(R.id.container);

         findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 // обработка клика
                 if (cardView.getAlpha() == 0){
                     cardView.animate().alpha(1).setDuration(0);
                 }else {
                     cardView.animate().alpha(0).setDuration(3000);
                 }
             }
         });

         findViewById(R.id.big_button).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (container.getVisibility() == View.VISIBLE){
                     container.setVisibility(View.GONE);
                 }else {
                     container.setVisibility(View.VISIBLE);
                 }
             }
         });

         findViewById(R.id.btn_oval).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 EditText editText = findViewById(R.id.edit_text);
                 String text = editText.getText().toString();
                 Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
             }
         });
    }
}