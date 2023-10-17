package com.lomu.potoapp.ui.uiElement.screen.MainScreen.subScreen


import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.lomu.potoapp.ui.uiElement.itemLazy.CardItemHeaderHome
import com.lomu.potoapp.ui.uiElement.itemLazy.CardItemSearch
import com.lomu.potoapp.ui.uiElement.theme.MainScreenStateTheme
import com.lomu.potoapp.ui.uiState.viewModel.SearchViewModel
import com.lomu.potoapp.ui.uiState.screenUiState.SearchUiState


@Composable
fun SearchScreen(
    parentNavController : NavHostController,
    subNavController : NavHostController ,
    viewModel : SearchViewModel = hiltViewModel()
){
    val state = viewModel.state.collectAsState()
    val context = LocalContext.current
    SearchContent(
        state = state.value,
        context = context,
        onChangeEditSearch = viewModel::onChangeEditSearch
    )
}

@SuppressLint("StateFlowValueCalledInComposition")
@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun SearchContent(
    state : SearchUiState,
    context : Context,
    onChangeEditSearch : (String) -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        CardItemSearch(state.searchInput,onChangeEditSearch)
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = MainScreenStateTheme
                ),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement
                .spacedBy(8.dp)
        ) {
            items(
                state.resultSearch.size,
                key = { state.resultSearch[it].id },
            ) {
                    CardItemHeaderHome(
                        nameUser = state.resultSearch[it].name,
                        timePosting = state.resultSearch[it].date,
                        profile = state.resultSearch[it].profile,
                        postImage = state.resultSearch[it].image,
                        modifier = Modifier
                            .animateItemPlacement()
                    )

            }
        }

        if(state.error.isNotEmpty()) {
            LaunchedEffect(
                key1 = state.error
            ) {
                Toast.makeText(
                    context,
                    "Not connection by internet",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}