package com.example.daggerapi.Repository

import com.example.daggerapi.Model.Post
import com.example.daggerapi.Network.PostApiService
import com.example.daggerapi.Network.PostServiceImp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class PostRepositry @Inject constructor(private val postApiService: PostServiceImp) {

    fun getPost():Flow<List<Post>> = flow {
        val response = postApiService.getPost()
        emit(response)
    }.flowOn(Dispatchers.IO)

}