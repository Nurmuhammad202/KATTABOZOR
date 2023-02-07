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

    private var _error = MutableLiveData<String>()
    val error: LiveData<String> = _error

    fun getOffer() = viewModelScope.launch {
        try{
            _offers.value = getOfferUseCase.execute()
        } catch (ex:Exception){
            _error.value="no internet"
        }
    }
}