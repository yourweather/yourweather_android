package com.umc.yourweather.remote.response

data class StringResponse(
    val success: Boolean,
    val code: Int,
    val message: String,
    val result: String
)