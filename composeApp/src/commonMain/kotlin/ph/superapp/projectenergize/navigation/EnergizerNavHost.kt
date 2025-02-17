package ph.superapp.projectenergize.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ph.superapp.projectenergize.dashboard.DashboardScreen
import ph.superapp.projectenergize.member.AddMemberScreen
import ph.superapp.projectenergize.member.MemberListScreen

@Composable
fun EnergizerNavHost(navController: NavHostController) {

    NavHost(
        modifier = Modifier,
        navController = navController,
        startDestination = EnergizerRoute.DashboardRoute
    ) {
        composable<EnergizerRoute.DashboardRoute> {
            DashboardScreen()
        }

        composable<EnergizerRoute.AddMemberRoute> {
            AddMemberScreen()
        }

        composable<EnergizerRoute.MemberListRoute> {
            MemberListScreen()
        }
    }
}