package ph.superapp.projectenergize

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import ph.superapp.projectenergize.navigation.navigationItemsList
import ph.superapp.projectenergize.navigation.setupNavHost

@Composable
@Preview
fun App() {

    val navHostController = rememberNavController()

    MaterialTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { TopAppBar(title = { Text("Home") }) },
            bottomBar = {
                BottomNavigation {
                    navigationItemsList.forEach {
                        val isSelected =
                            it.route.route == navHostController.currentDestination?.route
                        BottomNavigationItem(
                            selected = isSelected,
                            onClick = {
                                navHostController.navigate(it.route)
                            },
                            icon = {
                                IconButton(onClick = {}) {
                                    Icon(
                                        imageVector = if (isSelected) it.selectedIcon else it.unSelectedIcon,
                                        contentDescription = "bottom nav icon"
                                    )
                                }
                            }
                        )
                    }
                }
            }
        ) {
            setupNavHost(navController = navHostController)
        }
    }
}