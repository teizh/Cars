package com.example.rv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rv2.databinding.ActivityDetailBinding;
import com.example.rv2.databinding.ActivityMainBinding;
import com.example.rv2.recycler.Car;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;

//    ImageView imageView;
//    TextView textView;
//    TextView textViewDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (getIntent() != null) {
//            textViewDescription = (TextView) findViewById(R.id.textViewDescriptionDetail);
//            imageView = (ImageView) findViewById(R.id.imageViewDetail);
//            textView = (TextView) findViewById(R.id.textViewDetail);
//            imageView.setImageResource(((Car) getIntent().getSerializableExtra("car")).getImage());
//            textView.setText(((Car) getIntent().getSerializableExtra("car")).getName());
//            textViewDescription.setText(((Car) getIntent().getSerializableExtra("car")).getDescription());
            binding.imageViewDetail.setImageResource(((Car) getIntent().getSerializableExtra("car")).getImage());
            binding.textViewDetail.setText(((Car) getIntent().getSerializableExtra("car")).getName());
            binding.textViewDescriptionDetail.setText(((Car) getIntent().getSerializableExtra("car")).getDescription());
        }
    }
}