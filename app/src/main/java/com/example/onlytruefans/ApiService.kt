package com.example.onlytruefans

import com.example.onlytruefans.models.Comment
import com.example.onlytruefans.models.Post
import com.example.onlytruefans.models.User

import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<MutableList<User>>

    @GET("posts/{num}")
    suspend fun getPostById(@Path("num") num : Int): Response<Post>

    @GET("comments")
    suspend fun getCommentsByPost(@Query("postId") postId : Int): Response<MutableList<Comment>>

    @POST("posts")
    suspend fun createPost(@Body post: Post): Response<Post>
}
