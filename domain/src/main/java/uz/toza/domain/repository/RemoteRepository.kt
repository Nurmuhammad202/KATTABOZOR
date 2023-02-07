package uz.toza.domain.repository

import uz.toza.domain.model.Offer

interface RemoteRepository {
    suspend fun getOffers(): ArrayList<Offer>
}