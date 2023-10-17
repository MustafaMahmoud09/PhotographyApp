package com.lomu.potoapp.ui.uiState.viewModel


import com.lomu.potoapp.domain.useCase.GetHeaderPhotoUseCase
import com.lomu.potoapp.domain.useCase.GetHomePhotoUseCase
import com.lomu.potoapp.domain.useCase.RefreshHomeUseCase
import com.lomu.potoapp.domain.useCase.SetLoveOnPhotoUseCase
import com.lomu.potoapp.ui.uiState.screenUiState.HomeUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getHeaderPhotoUseCase: GetHeaderPhotoUseCase,
    private val getHomePhotoUseCase: GetHomePhotoUseCase,
    private val refreshHomeUseCase: RefreshHomeUseCase,
    private val setLoveOnPhotoUseCase: SetLoveOnPhotoUseCase
): BaseViewModel() {

    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    init {

        onChangeHeader()
        onChangePosts()
    }

    fun onRefresh(){

        refreshHomeUseCase()
    }
    private fun onChangeHeader(){

      coroutineScope.launch(Dispatchers.IO) {
          getHeaderPhotoUseCase().collect { headerPhoto ->
              _state.update {
                  it.copy(
                      photoHeader = headerPhoto
                  )
              }
          }
      }
    }

    private fun onChangePosts(){

      coroutineScope.launch (Dispatchers.IO) {
          getHomePhotoUseCase().collect { listHomePhoto ->
              _state.update {
                  it.copy(
                      photoItems = listHomePhoto,
                      isLoading = false
                  )
              }
          }
      }
    }

}