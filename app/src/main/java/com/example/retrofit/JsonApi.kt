package com.example.retrofit

import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface JsonApi {
    @POST("posts/")

    fun veriGetir(@Body insan:People):Call<Post>
}

/*
 interface JsonApi {
    @GET("posts/1")
    fun veriGetir():Call<Post>*/