package com.lomu.potoapp.ui.uiElement.screen.MainScreen.subScreen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.lomu.potoapp.R
import com.lomu.potoapp.ui.uiElement.itemLazy.CardImageHome
import com.lomu.potoapp.ui.uiElement.itemLazy.CardItemHeaderHome
import com.lomu.potoapp.ui.uiElement.itemLazy.HeaderItem
import com.lomu.potoapp.ui.uiElement.theme.MainScreenStateTheme
import com.lomu.potoapp.ui.uiState.screenUiState.HomeUiState
import com.lomu.potoapp.ui.uiState.viewModel.HomeViewModel


@Composable
fun HomeScreen(
    parentNavController: NavHostController,
    subNavController: NavHostController,
    viewModel: HomeViewModel = hiltViewModel()
){
    val state = viewModel.state.collectAsState()

    HomeContent(
        state = state.value ,
        onRefresh = viewModel::onRefresh
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun HomeContent(
    state : HomeUiState,
    onRefresh : () -> Unit
) {

    SwipeRefresh(
        state = rememberSwipeRefreshState(
            isRefreshing = false
        ),
        onRefresh = onRefresh
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = MainScreenStateTheme
                ),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement
                .spacedBy(8.dp)
        ) {

            stickyHeader(
                key = 1
            ) {
                HeaderItem(
                    text = stringResource(
                        id = R.string.share_your_moment
                    ),
                    textSize = 24
                )
            }

            item(
                key = 2
            ) {
                CardItemHeaderHome(
                    nameUser = state.photoHeader.name,
                    timePosting = state.photoHeader.time,
                    profile = state.photoHeader.imageProfile,
                    postImage = state.photoHeader.photo
                )
            }

            stickyHeader(
                key = 3
            ) {
                HeaderItem(
                    text = stringResource(
                        id = R.string.today_capture
                    ),
                    textSize = 18
                )
            }
            items(
                state.photoItems.size,
                key ={state.photoItems[it].id}
            ) {
                CardImageHome(
                    nameUser = state.photoItems[it].name,
                    timePosting = state.photoItems[it].time,
                    profile =  state.photoItems[it].imageProfile,
                    postTitle = if(state.photoItems[it].title == "null") "" else state.photoItems[it].title,
                    postImage = state.photoItems[it].photo,
                    numberLike = state.photoItems[it].numberOfLove.toString(),
                    stateIconLove = Color.Red,
                    modifier = Modifier
                        .animateItemPlacement()
                )
            }
        }
    }
}
