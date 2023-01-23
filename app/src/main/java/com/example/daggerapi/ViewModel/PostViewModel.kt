package com.example.daggerapi.ViewModel

import android.util.Log
//import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.daggerapi.Model.Post
import com.example.daggerapi.Repository.PostRepositry
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(private val postRepositry: PostRepositry) : ViewModel() {

 val response:LiveData<List<Post>> = postRepositry.getPost()
     .catch { e->
                Log.d("main","${e.message}")
        }.asLiveData()

}