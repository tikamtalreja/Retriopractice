package com.dsc.android.retropratice;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {
    @GET("v2/5c88a0162f00006516ec926c")
Call<UserWrapper> getUserList();
}
