package uz.toza.data.remote

import retrofit2.Response
import uz.toza.data.remote.model.GetOffer

class FaceApiInterface : ApiInterface {
    override suspend fun getOffer(): Response<GetOffer> {
        return Response.success(200, GetOffer(ArrayList()))
    }
}