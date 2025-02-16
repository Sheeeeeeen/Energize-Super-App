package ph.superapp.projectenergize.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class EnergizerRoute(val route: String) {

    @Serializable
    data object DashboardRoute : EnergizerRoute(route = "dashboard")

    data object MemberListRoute : EnergizerRoute(route = "memberList")

    data object AddMemberRoute : EnergizerRoute(route = "addMember")
}