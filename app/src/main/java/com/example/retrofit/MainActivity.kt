package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.POST


class MainActivity : AppCompatActivity() {
        var gelenveri:Post?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var insan=People()
        insan.body="hasani sikim"
        insan.id=1
        insan.title="musti sikim"
        insan.userId=1

        var apiInterface=ApiClient.client?.create(JsonApi::class.java)
        var apiCall=apiInterface?.veriGetir(insan)

        apiCall?.enqueue(object : Callback<Post> {

            override fun onResponse(call: Call<Post>?, response: Response<Post>?) {
                Log.e("BASARILI", ""+call?.request()?.url()?.toString())
                gelenveri=response?.body()
                Log.e("BASARILI", ""+gelenveri?.id.toString())
                Log.e("BASARILI", ""+gelenveri?.userId.toString())
                Log.e("BASARILI", ""+gelenveri?.body.toString())
                Log.e("BASARILI", ""+gelenveri?.title.toString())

            }

            override fun onFailure(call: Call<Post>?, t: Throwable?) {
                Log.e("BASARISIZ", ""+t?.printStackTrace())
            }


        })




    }
}
