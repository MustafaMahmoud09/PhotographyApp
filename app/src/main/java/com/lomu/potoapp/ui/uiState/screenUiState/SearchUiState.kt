package com.lomu.potoapp.ui.uiState.screenUiState

import com.lomu.potoapp.domain.models.PhotoSearchResult

data class SearchUiState(
    var searchInput : String = "",
    var resultSearch : List<PhotoSearchResult> = emptyList(),
    var isLoading : Boolean = false,
    var error : String = "",
)