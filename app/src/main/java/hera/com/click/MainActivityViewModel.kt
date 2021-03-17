package hera.com.click

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    private val _number = MutableLiveData<Int>()
    val number get() = _number

    init {
        _number.value = 0
    }

    fun numberIncrease() {
        _number.value = _number.value?.plus(1)
    }

}