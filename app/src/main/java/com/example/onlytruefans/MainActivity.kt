package com.example.onlytruefans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.contentValuesOf


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

private suspend fun executeCall() {
    val response = ApiClient.apiService.getPostById(1)
    if (response.isSuccessful && response.body() != null) {
        val content = response.body()
        return
    }
}