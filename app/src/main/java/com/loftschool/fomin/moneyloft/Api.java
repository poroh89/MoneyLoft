package com.loftschool.fomin.moneyloft;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {

    @GET("auth")
    Call<AuthResponse> auth(@Query("social_user_id") String userID);

    @GET("items")
    Call<List<Item>> getItems(@Query("type") String type, @Query("auth-token") String token);

    @POST("items/add")
    Call<Status> addItems(@Body AddItemsRequest request, @Query("auth-token") String token);

    @POST("items/remove")
    Call<Status> removeItem(@Query("id") int id, @Query("auth-token") String token);

    @GET("balance")
    Call<BalanceResponse> getBalance(@Query("auth-token") String token);

}
