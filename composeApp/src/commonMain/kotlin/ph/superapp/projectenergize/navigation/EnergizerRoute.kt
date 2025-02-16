package ph.superapp.projectenergize.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class EnergizerRoute(val route: String) {

    @Serializable
    data object DashboardRoute : EnergizerRoute(route = "dashboard")

    @Serializable
    data object MemberListRoute : EnergizerRoute(route = "memberList")

    @Serializable
    data object AddMemberRoute : EnergizerRoute(route = "addMember")
}