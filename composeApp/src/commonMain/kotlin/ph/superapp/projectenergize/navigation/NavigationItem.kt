package ph.superapp.projectenergize.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val unSelectedIcon: ImageVector /* or  DrawableResource*/,
    val selectedIcon: ImageVector /* or  DrawableResource*/,
    val title: String /* or  StringResource  */,
    val route: EnergizerRoute
)

val navigationItemsList = listOf(
    NavigationItem(
        unSelectedIcon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home,
        title = "Dashboard",
        route = EnergizerRoute.DashboardRoute
    ),
    NavigationItem(
        unSelectedIcon = Icons.Outlined.AccountCircle,
        selectedIcon = Icons.Filled.AccountCircle,
        title = "Member List",
        route = EnergizerRoute.MemberListRoute
    ),
    NavigationItem(
        unSelectedIcon = Icons.Outlined.Person,
        selectedIcon = Icons.Filled.Person,
        title = "Add Member",
        route = EnergizerRoute.AddMemberRoute
    )
)
