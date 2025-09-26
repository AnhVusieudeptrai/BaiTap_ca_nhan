package com.example.my_app;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // hoặc activity_login nếu file tên vậy

        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            // TODO: có thể thêm check username, password ở đây

            // Chuyển sang màn hình 2
            Intent intent = new Intent(LoginActivity.this, ManiMenuActivity.class);
            startActivity(intent);
        });
    }
}


