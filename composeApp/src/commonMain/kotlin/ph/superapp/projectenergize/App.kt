package ph.superapp.projectenergize

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import ph.superapp.projectenergize.navigation.EnergizerRoute
import ph.superapp.projectenergize.navigation.navigationItemsList
import ph.superapp.projectenergize.navigation.setupNavHost

@Composable
@Preview
fun App() {

    val navController = rememberNavController()

    var currentRouteTab by remember { mutableStateOf<EnergizerRoute>(EnergizerRoute.DashboardRoute) }

    MaterialTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { TopAppBar(title = { Text("Home") }) },
            bottomBar = {
                BottomNavigation {
                    navigationItemsList.forEach {
                        val isSelected = currentRouteTab == it.route
                        BottomNavigationItem(
                            selected = isSelected,
                            onClick = {
                                currentRouteTab = it.route
                                navController.navigate(it.route) {
                                    // Pop up to the start destination of the graph to
                                    // avoid building up a large stack of destinations
                                    // on the back stack as users select items
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    // Avoid multiple copies of the same destination when
                                    // reselecting the same item
                                    launchSingleTop = true
                                    // Restore state when reselecting a previously selected item
                                    restoreState = true
                                }
                            },
                            icon = {
                                Icon(
                                    imageVector = if (isSelected) it.selectedIcon else it.unSelectedIcon,
                                    contentDescription = "bottom nav icon"
                                )
                            }
                        )
                    }
                }
            }
        ) {
            setupNavHost(navController = navController)
        }
    }
}