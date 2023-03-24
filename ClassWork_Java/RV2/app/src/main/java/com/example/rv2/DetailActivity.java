package com.example.rv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rv2.recycler.Car;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getIntent() != null) {
            Car car = (Car) getIntent().getSerializableExtra("car");
//            imageView = itemView.findViewById(R.id.imageViewDetail);
//            imageView.setImageResource(car.getImage());
//            textView = textView.findViewById(R.id.textViewDetail);
//            textView.setText(car.getName());
//            textViewDescription = textViewDescription.findViewById(R.id.textViewDescriptionDetail);
//            textViewDescription.setText(car.getDescription());

            textView = textView.findViewById(R.id.textViewDetail);
            ((TextView) findViewById(R.id.textViewDetail)).setText(car.getName());

            System.out.println(car.getImage());
            System.out.println(car.getName());
            System.out.println(car.getDescription());
        }
    }
}