package uz.toza.kattabozor.ui.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.toza.domain.model.Offer
import uz.toza.domain.usecase.GetOfferUseCase
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getOfferUseCase: GetOfferUseCase) :
    ViewModel() {

    private var _offers = MutableLiveData<ArrayList<Offer>>()
    val offers: LiveData<ArrayList<Offer>> = _offers
    fun getOffer() = viewModelScope.launch {
        _offers.value = getOfferUseCase.execute()
    }
}