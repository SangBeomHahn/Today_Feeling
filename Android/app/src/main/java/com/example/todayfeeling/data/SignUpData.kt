package com.example.todayfeeling.data

import com.google.gson.annotations.SerializedName

data class SignUpData(
    @SerializedName("userId")
    val id: String,
    @SerializedName("userPw")
    val pw: String,
    @SerializedName("userName")
    val name: String,
    @SerializedName("userSex")
    val sex: String,
    @SerializedName("userEmail")
    val email: String,
    @SerializedName("anger")
    val anger: String,
    @SerializedName("fear")
    val fear: String,
    @SerializedName("happiness")
    val happiness: String,
    @SerializedName("sadness")
    val sadness: String,
    @SerializedName("surprise")
    val surprise: String
)
