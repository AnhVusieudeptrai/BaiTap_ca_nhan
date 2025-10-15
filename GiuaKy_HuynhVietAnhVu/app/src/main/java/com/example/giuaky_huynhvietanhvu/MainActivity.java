package com.example.giuaky_huynhvietanhvu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {
    EditText etHeight_2348,etWeight_2348;
    Button btnCalculate_2348;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etHeight_2348 = findViewById(R.id.etHeight_2348);
        etHeight_2348 = findViewById(R.id.etWeight_2348);
        btnCalculate_2348 = findViewById(R.id.btnCalculate_2348);
        btnCalculate_2348.setOnClickListener(v -> {
            String heightStr = etHeight_2348.getText().toString();
            String weightStr = etWeight_2348.getText().toString();
            if (TextUtils.isEmpty(heightStr) || TextUtils.isEmpty(weightStr)) {
                Toast.makeText(this, "Vui long nhap day du!", Toast.LENGTH_SHORT).show();
                return;
            }
            double height = Double.parseDouble(heightStr);
            double weight = Double.parseDouble(weightStr);

            Intent intent = new Intent(MainActivity.this, result.class);
            intent.putExtra("height", height);
            intent.putExtra("weight", weight);
            startActivity(intent);
        });
    }}
