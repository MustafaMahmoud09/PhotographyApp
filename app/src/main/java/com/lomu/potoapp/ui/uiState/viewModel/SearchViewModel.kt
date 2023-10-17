package com.lomu.potoapp.ui.uiState.viewModel


import com.lomu.potoapp.domain.status_request.Status
import com.lomu.potoapp.domain.useCase.GetPhotoResultSearchUseCase
import com.lomu.potoapp.ui.uiState.screenUiState.SearchUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getPhotoResultSearchUseCase : GetPhotoResultSearchUseCase
): BaseViewModel(){
    private val _state = MutableStateFlow(SearchUiState())
    val state = _state.asStateFlow()

    init {

        onSearch()
    }//end construct

    fun onChangeEditSearch(
        key : String
    ){
         _state.update {
             it.copy(
                 searchInput = key
             )
         }
    }


    private fun onSearch(){

        coroutineScope.launch(Dispatchers.IO) {
            _state.debounce(750).collect{ searchUiState->
                getPhotoResultSearchUseCase(
                    key = searchUiState.searchInput.trim()
                ).collect { state ->
                    when (state) {
                        is Status.Success -> {
                            _state.update {
                                it.copy(
                                    resultSearch = state.toData()!!,
                                    isLoading = false,
                                    error = ""
                                )
                            }
                        }
                        is Status.Error -> {
                            _state.update {
                                it.copy(
                                    error = state.message,
                                    isLoading = false
                                )
                            }
                        }
                        else -> {
                            _state.update {
                                it.copy(
                                    isLoading = true,
                                    error = ""
                                )
                            }
                        }
                    }
                }
            }
        }

    }
}//end SearchViewModel