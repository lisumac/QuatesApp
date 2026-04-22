package com.rkd.quatesapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson
import com.rkd.quatesapp.model.Quotes

object DataManager{
    var data = emptyArray<Quotes>()
    var isDataLoaded=   mutableStateOf(false)
    fun loadAssetFromFile(context: Context, ){
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()

        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()

        val json = String(buffer, Charsets.UTF_8)

        val gson = Gson()
        data = gson.fromJson(json, Array<Quotes>::class.java)
        isDataLoaded.value = true
    }
}