package uz.toza.data.remote

import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import uz.toza.data.remote.retrofitBuilder.RetrofitBuilder

class RetrofitTest {

    private lateinit var apiInterface: ApiInterface

    @Before
    fun initApiInterface() {
        apiInterface = RetrofitBuilder.apiInterfaceBuilder()
    }

    @Test
    fun getOffer() = runBlocking {
        val data = apiInterface.getOffer().body()
        val expected= data?.offers?.get(0)?.brand
        val actual = "Apple"
        Assert.assertEquals(expected, actual)
    }

}