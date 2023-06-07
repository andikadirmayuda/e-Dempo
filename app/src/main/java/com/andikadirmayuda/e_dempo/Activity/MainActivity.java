package com.andikadirmayuda.e_dempo.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.andikadirmayuda.e_dempo.Model.ModelAplikasi;
import com.andikadirmayuda.e_dempo.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAplikasi;
    private ProgressBar pbAplikasi;
    private FloatingActionButton fabTambah;

    private RecyclerView.Adapter adAplikasi;
    private RecyclerView.LayoutManager lmAplikasi;
    private List<ModelAplikasi> listAplikasi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAplikasi = findViewById(R.id.rv_aplikasi);
        pbAplikasi = findViewById(R.id.pb_aplikasi);
        fabTambah = findViewById(R.id.fab_tambah);

        lmAplikasi = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvAplikasi.setLayoutManager(lmAplikasi);

        fabTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TambahActivity.class));
            }
        });

    }
    public void retrieveAplikasi(){

    }

    @Override
    protected void onResume() {
        super.onResume();
        retrieveAplikasi();
    }
}