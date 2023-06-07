package com.andikadirmayuda.e_dempo.API;

public class Retroserver {
    private static final String alamatserver = "";

    private static Retrofit retro;

    public static Retrofit koneksiRetrofit(){
        if(retro==null){
            retro = new Retrofit.Builder()
                    .baseUrl(alamatserver)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retro;
    }


}
