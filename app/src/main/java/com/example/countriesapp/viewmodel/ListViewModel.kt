package com.example.countriesapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.countriesapp.model.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData = listOf(Country("CounrtyA"),
            Country("CounrtyB"),
            Country("CounrtyC"),
            Country("CounrtyD"),
            Country("CounrtyE"),
            Country("CounrtyF"),
            Country("CounrtyG"),
            Country("CounrtyH"),
            Country("CounrtyI"),
            Country("CounrtyJ"),
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }
}