package com.lomu.potoapp.domain.useCase

import com.lomu.potoapp.data.repository.HomeRepository

class RefreshHomeUseCase(
    private val homeRepository: HomeRepository,
) {
    operator fun invoke(){

        homeRepository.refreshDataHome()
    }
}