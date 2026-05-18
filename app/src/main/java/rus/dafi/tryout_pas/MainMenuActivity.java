package rus.dafi.tryout_pas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity {

    RecyclerView rvBangunDatarList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvBangunDatarList = (RecyclerView) findViewById(R.id.rvBangunDatarList);

        ArrayList<BangunDatarModel> listBangunDatar = new ArrayList<>();

        BangunDatarModel bangun1 = new BangunDatarModel("Persegi", "Luas : Sisi x Sisi", "Keliling : Panjang x Lebar", "4", "Persegi adalah salah salah satu bangun datar yang memiliki 4 sisi.");
        listBangunDatar.add(bangun1);

        BangunDatarModel bangun2 = new BangunDatarModel("Persegi Panjang", "Luas : Panjang x Lebar", "Keliling : Panjang x Lebar", "4", "Persegi Panjang adalah salah salah satu bangun datar yang memiliki 4 sisi.");
        listBangunDatar.add(bangun2);

        BangunDatarModel bangun3 = new BangunDatarModel("Segitiga", "Luas : Alas x Tinggi", "Keliling : Alas x Tinggi", "3", "Segitiga adalah salah salah satu bangun datar yang memiliki 3 sisi.");
        listBangunDatar.add(bangun3);

        BangunDatarModel bangun4 = new BangunDatarModel("Jajar Genjang", "Luas : Alas x Tinggi", "Keliling : Alas x Tinggi", "2", "Jajar Genjang adalah salah salah satu bangun datar yang memiliki 2 sisi.");
        listBangunDatar.add(bangun4);

        BangunDatarModel bangun5 = new BangunDatarModel("Trapesium", "Luas : Sisi atas x Sisi bawah", "Keliling : Sisi atas x Sisi bawah", "4", "Trapesium adalah salah salah satu bangun datar yang memiliki 4 sisi.");
        listBangunDatar.add(bangun5);

        BangunDatarModel bangun6 = new BangunDatarModel("Belah Ketupat", "Luas : Sisi x Sisi", "Keliling : Sisi x Sisi", "4", "Belah Ketupat adalah salah salah satu bangun datar yang memiliki 4 sisi.");
        listBangunDatar.add(bangun6);

        // Set ke adapter
        BangunDatarAdapter adapter = new BangunDatarAdapter(listBangunDatar, new BangunDatarAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BangunDatarModel siswa) {
//                Toast.makeText(MainMenuActivity.this, "Nama : " + siswa.getNama() + "\nAbsen : " + siswa.getAbsen() + ", Alamat : " + siswa.getAlamat(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainMenuActivity.this, DetailBangunDatar.class);
                intent.putExtra("namaBangunDatar", siswa.getnamaBangunDatar());
                intent.putExtra("luasBangunDatar", siswa.getluasBangunDatar());
                intent.putExtra("sisiBangunDatar", siswa.getsisiBangunDatar());
                intent.putExtra("kelilingBangunDatar", siswa.getkelilingBangunDatar());
                intent.putExtra("detailBangunDatar", siswa.getdetailBangunDatar());
                startActivity(intent);
            }
        });

        rvBangunDatarList.setLayoutManager(new LinearLayoutManager(MainMenuActivity.this));
        rvBangunDatarList.setAdapter(adapter);
    }
}