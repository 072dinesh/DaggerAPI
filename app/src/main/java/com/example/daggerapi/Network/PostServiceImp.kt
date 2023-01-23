package com.example.daggerapi.Network

import com.example.daggerapi.Model.Post
import javax.inject.Inject

class PostServiceImp @Inject constructor(private val postApiService: PostApiService){

    suspend fun getPost():List<Post> = postApiService.getPost()


}