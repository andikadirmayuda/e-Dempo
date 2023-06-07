package com.andikadirmayuda.e_dempo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.andikadirmayuda.e_dempo.Model.ModelAplikasi;
import com.andikadirmayuda.e_dempo.R;

import java.util.List;

public class AdapterAplikasi extends RecyclerView.Adapter<AdapterAplikasi.VHAplikasi>{

    private Context ctx;
    private List<ModelAplikasi> listAplikasi;

    public AdapterAplikasi(Context ctx, List<ModelAplikasi> listAplikasi) {
        this.ctx = ctx;
        this.listAplikasi = listAplikasi;
    }

    @NonNull
    @Override
    public VHAplikasi onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.list_item_aplikasi, parent,false);
        return new VHAplikasi(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull VHAplikasi holder, int position) {
        ModelAplikasi MA = listAplikasi.get(position);

        holder.tvId.setText(MA.getId());
        holder.tvNama.setText(MA.getNama());
        holder.tvJeniskelamin.setText(MA.getJeniskelamin());
        holder.tvUsia.setText(MA.getUsia());
        holder.tvAlamat.setText(MA.getAlamat());
        holder.tvNotelpon.setText(MA.getNotelpon());

    }

    @Override
    public int getItemCount() {
        return listAplikasi.size();
    }

    public class VHAplikasi extends RecyclerView.ViewHolder{
        TextView tvId, tvNama, tvJeniskelamin, tvUsia, tvAlamat, tvNotelpon;


        public VHAplikasi(@NonNull View iteView){
            super(iteView);
            tvId = iteView.findViewById(R.id.tv_id);
            tvNama = iteView.findViewById(R.id.tv_nama);
            tvJeniskelamin = iteView.findViewById(R.id.tv_jeniskelamin);
            tvUsia = iteView.findViewById(R.id.tv_usia);
            tvAlamat = iteView.findViewById( R.id.tv_alamat);
            tvNotelpon = iteView.findViewById(R.id.et_notelppon);

        }

    }
}
