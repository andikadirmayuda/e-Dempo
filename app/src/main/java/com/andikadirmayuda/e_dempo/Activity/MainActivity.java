package com.andikadirmayuda.e_dempo.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.andikadirmayuda.e_dempo.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAplikasi;
    private ProgressBar pbAplikasi;
    private FloatingActionButton fabTambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAplikasi = findViewById(R.id.rv_aplikasi);
        pbAplikasi = findViewById(R.id.pb_aplikasi);
        fabTambah = findViewById(R.id.fab_tambah);

    }
}