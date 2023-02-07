package uz.toza.data.repository

import uz.toza.data.extension.success
import uz.toza.data.remote.ApiInterface
import uz.toza.domain.model.AttributeModel
import uz.toza.domain.model.Offer
import uz.toza.domain.repository.RemoteRepository

class RemoteRepositoryIml(private val apiInterface: ApiInterface) : RemoteRepository {
    override suspend fun getOffers(): ArrayList<Offer> {
        val response = apiInterface.getOffer()
        val list = ArrayList<Offer>()
        if (success(response)) {
            response.body()?.let { getOffer ->
                getOffer.offers.forEach { offer ->
                    val attributeModel = ArrayList<AttributeModel>()
                    offer.attributes.forEach {
                        attributeModel.add(AttributeModel(it.name, it.value))
                    }
                    list.add(
                        Offer(
                            attributes = attributeModel,
                            brand = offer.brand,
                            category = offer.category,
                            id = offer.id,
                            image = offer.image.url,
                            merchant = offer.merchant,
                            name = offer.name
                        )
                    )
                }

            }
        }

        return list
    }
}