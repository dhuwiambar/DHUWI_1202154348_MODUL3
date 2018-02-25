package com.example.lenovo.dhuwi_1202154348_modul3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AdapterAir extends RecyclerView.Adapter<AdapterAir.aerholder>{

    private Context con;
    private List<Air> listaernya;

    //Constructor
    public AdapterAir(Context con, List<Air> listaernya) {
        this.con = con;
        this.listaernya = listaernya;
    }

    //Method ketika holder dibuat

    @Override
    public aerholder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Mendapatkan layout untuk recyclerview
        View v = LayoutInflater.from(con).inflate(R.layout.layoutairnya, parent, false);
        aerholder x = new aerholder(v);
        return x;
    }


    //Method untuk memberikan nilai pada holder berdasarkan class aer

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(aerholder holder, int position) {
        Air aernya = listaernya.get(position);
        holder.nama.setText(aernya.getNama().toString());
        holder.detail.setText(aernya.getDetail().toString());
    //holder.rl.setBackground(holder.rl.getResources().getDrawable(aernya.getBaack()));
        holder.rl.setBackground(holder.rl.getResources().getDrawable(aernya.getBaack()));
        holder.nama.setTag(aernya.getBaack());
    }

    //Menentukan ukuran list

    @Override
    public int getItemCount() {
        return listaernya.size();
    }


    //Sub class sebagai holder
    class aerholder extends RecyclerView.ViewHolder {
        RelativeLayout rl;
        TextView nama;
        TextView detail;

        public aerholder(View itemView) {
            super(itemView);

            //Menentukan object berdasarkan id-nya
            rl = itemView.findViewById(R.id.root_air);
            nama = itemView.findViewById(R.id.nama_aer);
            detail = itemView.findViewById(R.id.detail_air);

            //Method ketika cardview diklik
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Mendefinisikan intent baru
                    Intent pindahin = new Intent(con, DetailAir.class);
                    //Menambahkan string extra untuk activity selanjutnya
                    pindahin.putExtra("nama", nama.getText());
                    pindahin.putExtra("detail", detail.getText());
                    pindahin.putExtra("background", nama.getTag().toString());
                    //Memulai activity baru
                    con.startActivity(pindahin);
                }
            });
        }
    }
}
