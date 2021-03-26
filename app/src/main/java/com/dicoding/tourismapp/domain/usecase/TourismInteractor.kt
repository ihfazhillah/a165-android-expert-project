package com.dicoding.tourismapp.domain.usecase

import androidx.lifecycle.LiveData
import com.dicoding.tourismapp.core.data.Resource
import com.dicoding.tourismapp.core.data.TourismRepository
import com.dicoding.tourismapp.domain.model.Tourism
import com.dicoding.tourismapp.domain.repository.ITourismRepository

class TourismInteractor(private val tourismRepository: ITourismRepository): TourismUseCase {
    override fun getAllTourism(): LiveData<Resource<List<Tourism>>> = tourismRepository.getAllTourism()

    override fun getFavoriteTourism(): LiveData<List<Tourism>> = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) = tourismRepository.setFavoriteTourism(tourism, state)
}