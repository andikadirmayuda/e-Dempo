package com.andikadirmayuda.e_dempo.Model;

import java.util.List;

public class ModelResponse {
    private String kode, pesan;
    private List<ModelAplikasi> data;

    public String getKode() {
        return kode;
    }

    public String getPesan() {
        return pesan;
    }

    public List<ModelAplikasi> getData() {
        return data;
    }
}
