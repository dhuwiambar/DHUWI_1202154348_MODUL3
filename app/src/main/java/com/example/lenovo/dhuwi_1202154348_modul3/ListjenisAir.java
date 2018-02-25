package com.example.lenovo.dhuwi_1202154348_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class ListjenisAir extends AppCompatActivity {
    RecyclerView rv;
    AdapterAir adapter;
    List<Air> aernya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listjenis_air);
        //kasih judul
        setTitle("List Air");

        //Konfigurasi recyclerview
        rv = findViewById(R.id.list_air);
        rv.setHasFixedSize(true);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            rv.setLayoutManager(new GridLayoutManager(ListjenisAir.this, 1));
        } else {
            rv.setLayoutManager(new GridLayoutManager(ListjenisAir.this, 2));
        }

        //inisialisasi list buat aer
        aernya = new ArrayList<>();

        //Manggil method buat dapetin data aer
        initdata();
    }

    //Memeriksa ketika orientasi layar berubah
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            rv.setLayoutManager(new GridLayoutManager(ListjenisAir.this, 1));
        } else {
            rv.setLayoutManager(new GridLayoutManager(ListjenisAir.this, 2));
        }
    }

    //Method untuk memasukkan data
    public void initdata() {
        aernya.add(new Air("Ades", "Air ini bernama Ades, dan ini merupakan air yang pertama kali saya tambahkan di activity ini.", R.drawable.ades));
        aernya.add(new Air("Amidis", "Nama airnya amidis", R.drawable.amidis));
        aernya.add(new Air("Aqua", "Nama airnya aqua", R.drawable.aqua));
        aernya.add(new Air("Cleo", "Nama airnya Cleo", R.drawable.cleo));
        aernya.add(new Air("Club", "Nama airnya Club", R.drawable.club));
        aernya.add(new Air("Equil", "Nama airnya Equil", R.drawable.equil));
        aernya.add(new Air("Evian", "Nama airnya Evian", R.drawable.evian));
        aernya.add(new Air("Le Minarale", "Nama airnya Le Minerale", R.drawable.leminerale));
        aernya.add(new Air("Nestle", "Nama airnya Nestle", R.drawable.nestle));
        aernya.add(new Air("Pristine", "Nama airnya Pristine", R.drawable.pristine));
        aernya.add(new Air("Vit", "Nama airnya Vit", R.drawable.vit));

        //Inisialisasi pada adapter
        adapter = new AdapterAir(ListjenisAir.this, aernya);
        //Mengatur adapter untuk recyvlerview
        rv.setAdapter(adapter);
    }

}
