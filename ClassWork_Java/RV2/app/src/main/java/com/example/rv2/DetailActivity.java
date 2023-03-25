package com.example.rv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rv2.recycler.Car;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        if (getIntent() != null) {
            Car car = (Car) getIntent().getSerializableExtra("car");
            imageView = (ImageView) findViewById(R.id.imageViewDetail);
            imageView.setImageResource(((Car) getIntent().getSerializableExtra("car")).getImage());
            textView = (TextView) findViewById(R.id.textViewDetail);
            textView.setText(((Car) getIntent().getSerializableExtra("car")).getName());
            textViewDescription = (TextView) findViewById(R.id.textViewDescriptionDetail);
            textViewDescription.setText(((Car) getIntent().getSerializableExtra("car")).getDescription());
        }
    }
}