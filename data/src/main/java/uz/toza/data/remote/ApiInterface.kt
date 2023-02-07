package uz.toza.data.remote

import retrofit2.Response
import retrofit2.http.GET
import uz.toza.data.remote.model.GetOffer

interface ApiInterface {
    @GET("offers")
    suspend fun getOffer(
    ): Response<GetOffer>
}