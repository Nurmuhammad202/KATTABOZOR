package uz.toza.data.remote

import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import uz.toza.data.repository.RemoteRepositoryIml

class RemoteRepositoryImlTest {

    private var faceApiInterface = FaceApiInterface()
    private var remoteRepositoryIml = RemoteRepositoryIml(faceApiInterface)

    @Test
    fun testRemoteRepositoryImlGetOffer() = runBlocking {
        val response = remoteRepositoryIml.getOffers()
        Assert.assertEquals(response.size, 0)
    }

}

