package com.example.clientip;

import org.json.JSONObject;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("/?api-key=cb945b3f1d24b1924eac15c0787a9b965c60bd6ee103ee626afb8368")
    //Call<List<APIModel>> getAllPhotos();
    Call<ResponseBody> getAllIPData();

}
