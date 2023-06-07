package com.andikadirmayuda.e_dempo.API;

import android.telecom.Call;

import com.andikadirmayuda.e_dempo.Model.ModelResponse;

public interface APIRequestData {
    @GET("retrieve.php")
    Call<ModelResponse> ardRetrieve();
}
