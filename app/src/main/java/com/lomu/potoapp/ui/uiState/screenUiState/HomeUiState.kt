package com.lomu.potoapp.ui.uiState.screenUiState

import com.lomu.potoapp.domain.models.HeaderPhoto
import com.lomu.potoapp.domain.models.HomePhoto

data class HomeUiState(
    var photoHeader : HeaderPhoto = HeaderPhoto(),
    var photoItems : List<HomePhoto> = emptyList(),
    var isLoading : Boolean = true,
    var error : String = "",
)