package uz.toza.kattabozor.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.toza.domain.repository.RemoteRepository
import uz.toza.domain.usecase.GetOfferUseCase

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetBalance(remoteRepository: RemoteRepository): GetOfferUseCase {
        return GetOfferUseCase(remoteRepository = remoteRepository)
    }

}