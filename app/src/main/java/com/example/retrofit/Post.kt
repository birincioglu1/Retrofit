package com.example.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
 class Post {
    @Expose
    @SerializedName("body")
    var body: String? = null
    @Expose
    @SerializedName("title")
    var title: String? = null
    @Expose
    @SerializedName("id")
    var id: Int = 0
    @Expose
    @SerializedName("userId")
    var userId: Int = 0
}
