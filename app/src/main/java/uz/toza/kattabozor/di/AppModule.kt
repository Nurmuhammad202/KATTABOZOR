package uz.toza.kattabozor.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.toza.data.remote.ApiInterface
import uz.toza.data.remote.retrofitBuilder.RetrofitBuilder
import uz.toza.data.repository.RemoteRepositoryIml
import uz.toza.domain.repository.RemoteRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideRetrofitGetServer(): ApiInterface {
        return RetrofitBuilder.apiInterfaceBuilder()
    }

    @Provides
    @Singleton
    fun provideRemoteRepository(apiInterface: ApiInterface): RemoteRepository {
        return RemoteRepositoryIml(apiInterface = apiInterface)
    }
}