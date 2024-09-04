package com.example.mrp.retrofit

import com.example.mrp.retrofit.Character
import retrofit2.http.GET

interface CharacterApi {

    @GET("characters")     // END - POINT
    suspend fun getCharacters(): List<Character>

}