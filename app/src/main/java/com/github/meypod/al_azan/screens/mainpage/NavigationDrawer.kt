package com.github.meypod.al_azan.screens.mainpage

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.github.meypod.al_azan.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun SampleNavigationDrawer(navItems: List<NavItem>, navController: NavController, scope: CoroutineScope, drawerState: DrawerState){
    LazyColumn(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .width(dimensionResource(R.dimen.drawer_width))
            .fillMaxHeight()
    ) {
        item {
            Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_extra_medium)))
            Box(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.surfaceContainerHigh)
                    .height(dimensionResource(R.dimen.button_large))
                    .fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd
            ) {
                IconButton(onClick = {
                    scope.launch { drawerState.close() }
                }) {
                    Icon(
                        modifier = Modifier.size(dimensionResource(R.dimen.icon_medium)),
                        painter = painterResource(R.drawable.ic_prev_page),
                        contentDescription = stringResource(R.string.back),
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacer_large)))
        }
        items(navItems) { item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { navController.navigate(item.route) }
                    .padding( dimensionResource(R.dimen.drawer_content_padding)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(dimensionResource(R.dimen.icon_medium)),
                    painter = painterResource(item.icon),
                    contentDescription = stringResource(item.label),
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                Text(
                    text = stringResource(item.label),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}
data class NavItem(val icon: Int, val label: Int, val route: String)