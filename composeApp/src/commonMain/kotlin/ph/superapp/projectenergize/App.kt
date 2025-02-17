package ph.superapp.projectenergize

import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import ph.superapp.projectenergize.navigation.EnergizerBottomNavigation
import ph.superapp.projectenergize.navigation.EnergizerRoute
import ph.superapp.projectenergize.navigation.EnergizerNavHost

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
                EnergizerBottomNavigation(
                    navController = navController,
                    currentRouteTab = currentRouteTab,
                    onTabSelected = { currentRouteTab = it }
                )
            }
        ) {
            EnergizerNavHost(navController = navController)
        }
    }
}