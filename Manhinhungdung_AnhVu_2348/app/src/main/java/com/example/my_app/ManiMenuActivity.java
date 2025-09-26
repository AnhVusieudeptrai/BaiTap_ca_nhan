package com.example.my_app;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ManiMenuActivity extends Activity {

    TextView txtWelcome;
    Button btnSanPham, btnGioHang, btnYeuThich, btnTaiKhoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mani_menu);

        // Ánh xạ view
        txtWelcome = findViewById(R.id.txtWelcome);
        btnSanPham = findViewById(R.id.btnSanPham);
        btnGioHang = findViewById(R.id.btnGioHang);
        btnYeuThich = findViewById(R.id.btnYeuThich);
        btnTaiKhoan = findViewById(R.id.btnTaiKhoan);

        // Bạn có thể thêm sự kiện click sau này, ví dụ:
        btnSanPham.setOnClickListener(v -> {
            // Ví dụ: Mở màn hình sản phẩm (chưa tạo thì để tạm Intent comment lại)
            // startActivity(new Intent(MainMenu_Activity.this, SanPham_Activity.class));
        });

        btnGioHang.setOnClickListener(v -> {
            // startActivity(new Intent(MainMenu_Activity.this, GioHang_Activity.class));
        });

        btnYeuThich.setOnClickListener(v -> {
            // startActivity(new Intent(MainMenu_Activity.this, YeuThich_Activity.class));
        });

        btnTaiKhoan.setOnClickListener(v -> {
            // startActivity(new Intent(MainMenu_Activity.this, TaiKhoan_Activity.class));
        });
    }
}

