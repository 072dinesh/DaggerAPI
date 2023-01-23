package com.example.daggerapi.Network

import com.example.daggerapi.Model.Post
import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
   suspend fun getPost():List<Post>

}