package rus.dafi.tryout_pas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailBangunDatar extends AppCompatActivity {

    TextView  tvNamaBangunDatar, tvLuasBangunDatar, tvSisiBangunDatar, tvKelilingBangunDatar, tvDetailBangunDatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_bangun_datar);

        tvNamaBangunDatar = findViewById(R.id.tvNamaBangunDatar);
        tvLuasBangunDatar = findViewById(R.id.tvLuas);
        tvSisiBangunDatar = findViewById(R.id.tvSisi);
        tvKelilingBangunDatar = findViewById(R.id.tvKeliling);
        tvDetailBangunDatar = findViewById(R.id.tvDetail);

        String nama = getIntent().getStringExtra("namaBangunDatar");
        String luas = getIntent().getStringExtra("luasBangunDatar");
        String keliling = getIntent().getStringExtra("kelilingBangunDatar");
        String sisi = getIntent().getStringExtra("sisiBangunDatar");
        String detail = getIntent().getStringExtra("detailBangunDatar");

        tvNamaBangunDatar.setText(nama);
        tvLuasBangunDatar.setText(luas);
        tvKelilingBangunDatar.setText(keliling);
        tvSisiBangunDatar.setText(sisi);
        tvDetailBangunDatar.setText(detail);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}