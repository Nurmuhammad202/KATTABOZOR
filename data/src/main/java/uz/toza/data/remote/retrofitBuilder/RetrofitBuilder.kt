package uz.toza.data.remote.retrofitBuilder

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.toza.data.remote.ApiInterface

object RetrofitBuilder {

    private const val BASE_URL = "https://www.kattabozor.uz/hh/test/api/v1/"

    /** create singleton retrofit obj*/
    fun apiInterfaceBuilder(): ApiInterface {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(ApiInterface::class.java)
    }
}