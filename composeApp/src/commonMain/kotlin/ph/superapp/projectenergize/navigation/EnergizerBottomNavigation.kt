package ph.superapp.projectenergize.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

@Composable
fun EnergizerBottomNavigation(
    navController: NavController,
    currentRouteTab: EnergizerRoute,
    onTabSelected: (EnergizerRoute) -> Unit
) {
    BottomNavigation {
        navigationItemsList.forEach {
            val isSelected = currentRouteTab == it.route
            BottomNavigationItem(
                selected = isSelected,
                onClick = {
                    onTabSelected(it.route)
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