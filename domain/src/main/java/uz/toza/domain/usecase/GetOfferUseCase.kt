package uz.toza.domain.usecase

import uz.toza.domain.model.Offer
import uz.toza.domain.repository.RemoteRepository

class GetOfferUseCase(private val remoteRepository: RemoteRepository) {
    suspend fun execute(): ArrayList<Offer> {
        return remoteRepository.getOffers()
    }
}