package com.example.mrp.repository

import com.example.mrp.retrofit.Character
import com.example.mrp.retrofit.CharacterApi

class CharacterRepo(private val characterApi: CharacterApi) {

    suspend fun getCharacters(): List<Character>{
        return characterApi.getCharacters()
    }
}